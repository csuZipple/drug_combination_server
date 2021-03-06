let rootUrl = "http://"+window.location.host;
$(".zl_drop_down").click(function (e) {
    e.stopPropagation();
    $(".zl_contact_dialog").show();
});
//If the URL appears space???
$("body").click(function (e) {
    let elem = e.target||e.srcElement;
    while (elem) {
        if (elem.className==='zl_contact_dialog') {
            return;
        }
        elem = elem.parentNode;
    }
    $(".zl_contact_dialog").hide();
});

function toLearnMore(target) {
    // to show more details
    $(".zl_main_page aside").css({
        "transform":"translateX(130%)"
        /* should hide the aside img..? */
    });
    $(".zl_main_page main >p").css({
        "display":"none"
    });

    $(".zl_main_page main").css({
        "width":"50%",
        "margin":"20px auto",
        "padding":"18px"
    });
    $(".zl_detail").fadeIn();
    $(target).fadeOut();
}
function hideLearnMore() {
    // to hide more details
    $(".zl_main_page aside").css({
        "transform":"translateX(0)"
    });
    $(".zl_main_page main >p").css({
        "display":"block"
    });

    $(".zl_main_page main").css({
        "width":"30%",
        "margin":"100px 0 0 250px",
        "padding":"0"
    });
    $(".zl_detail").fadeOut();
    $(".zl_learn_more").fadeIn();
}

function onSubmit() {
    //get values
    // send emails.
    //reset input after be submitted
}

/* about search function */
$(".zl_search_wrapper input").bind("input",function () {
    let value = $(".zl_search_wrapper input").val();
    let root = rootUrl+"/integrate/search";
    let data={
        "q":value
    };
    $.ajax({
        type: 'POST',
        url: root,
        data: data,
        beforeSend:function(){
            console.log("searching ..",value)
        },
        success: function (data) {
            console.log(data);
            $(".zl_search_tips").show();
            let parent = $(".zl_search_tips ul");
            parent.empty("");
            if (data.length!==0){
                $.each(data,function (index, ele) {
                    createSearchTips(ele);
                });
            }else{
                let tips = "<li>Do not found this drug</li>";
                parent.append($(tips))
            }
        },
    });
});

function createSearchTips(data) {
    let parent = $(".zl_search_tips ul");
    console.log(typeof data);
    if (typeof data ==="string") {
        let drug1name = changeSpace(data);
        let tips = "<li><a href="+"./individual_drug_detail.html?drug1Name="+drug1name+">"+drug1name+"</a></li>";
        parent.append($(tips))
    }else{
       console.log("no searching data founded.")
    }

}

function changeSpace(str) {
    return str.replace(/\s+/g, "%20");
}
function unchangeSpace(str) {
   return str.replace(/%20/g," ");
}
/* about internet request .*/
function loadDrugPage(page, size) {
    let root = rootUrl+"/integrate/page";
    /*http://localhost:8080/integrate/page?page=1&size=19*/
    let data={
        "page":page,
        "size":size
    };
    $.ajax({
        type: 'POST',
        url: root,
        data: data,
        beforeSend:function(){
            $(".zl_loader").css("display","flex");
        },
        success: function (data) {
            console.log(data);
            $(".zl_loader").css("display","none");
            console.log("总页数:",data.totalPages-1);
            $(".total_page").text(data.totalPages-1);
            $(".zl_table tr").each(function (index) {
                if (index!==0&&index!==1){
                    console.log(index);
                    $(this).empty();
                }
            });
            if (data.content.length!==0){
                $.each(data.content,function (index, ele) {
                    createRow(ele);
                });
                //update page controls

            }else{
                alert("当前页数据为空...")
            }
        },
    });
}

function createRow(element) {
    let drug1name = changeSpace(element.drug1Name);
    let drug2name = changeSpace(element.drug2Name);
    let row = "<tr><td><a href="+"./individual_drug_detail.html?id="+element.id+"&drug1Name="+drug1name+">"+drug1name+"</a></td><td><a href="+"./individual_drug_detail.html?id="+element.id+"&drug1Name="+drug2name+">"+drug2Name+"</a></td><td>"+element.conc1+"</td><td>"+element.conc2+"</td><td>"+element.growth+"</td><td>"+element.cellline+"</td><td><a href="+"./drug_origin_data.html?fid="+element.fid+"&source="+element.source+">"+element.source+"</a></td></tr>";
    $(".zl_table").append($(row));
}

function gotoPage(num,currentSize) {
    console.log("jump to :",num);
    if (parseInt(num)<0){
        console.log("非法跳转");
        return;
    }
    $(".current").text(num);

    if(num==0){
        $(".pre_page").addClass("disabled");
    }else{
        $(".pre_page").removeClass("disabled");
    }

    let maxPage = $(".total_page").text();

    if(num==maxPage){
        $(".next_page").addClass("disabled");
    }else{
        $(".next_page").removeClass("disabled");
    }

    loadDrugPage(num,currentSize);
}

function getParamFromUrl(parameter) {
    let reg = new RegExp("(^|&)"+ parameter +"=([^&]*)(&|$)");
    let r = window.location.search.substr(1).match(reg);
    if(r!=null && r[2]!=="")
        return  unchangeSpace(r[2]);
    return null;
}