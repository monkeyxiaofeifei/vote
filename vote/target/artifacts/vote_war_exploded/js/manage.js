//addcolor


//choose all and choose more
//function chooseAll() {
//	$("#btn").click(function() {
//		$("input[name='a']").prop("checked", this.checked);
//	});
//	$("input[name='a']").click(function() {
//		var $subs = $("input[name='a']");
//		$("#btn").prop("checked", $subs.length == $subs.filter(":checked").length ? true : false);
//	});
//}// choose all and choose more end

// delete choose delete more
// delete choose delete more end
//}// delete one end

//march

//change student



//add student
//add student enter

//popup
//popup end

//click enter
//$('#addUserInform').on("click",function(){
//	if($(this).hasClass("addStudent")){
//	addEnter();
//	addColor();
//	}
//	if($(this).hasClass("changeStudent")){
//	changeEnter(window.changeobject);
//	}
//})
//click enter end

//change student info enter end
//close and cancel
//function colseZz() {
//	$('#zz').css('display', 'none');
//	$('#addUser').css('display', 'none');
//}
//close and cancel end
   var json1={"mes":[{"nid":"06144134",
	  "electric":"222",
	  "date":"2017/09/24",
	  "time":"19:20:34",
	  "temperature":"50度",
	   "vibration":"0",
	   "longitude":"22",
	   "latitude":"22",
	   "altitude":"ggg",
	   }]}

function addColor(i) {	
			$('#userTbody tr').eq(i).addClass('info');
}//addcolor end
function showmes(mes){
	for(var i in mes){
							$('tbody').append($('<tr><td class="checkbox m-0"><label><input type="checkbox" name="a"></label></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td> <td></td></tr>'));
							$('tbody tr:last td:eq(1)').html(mes[i]["nid"]);
							$('tbody tr:last td:eq(2)').html(mes[i]["electric"]);
							$('tbody tr:last td:eq(3)').html(mes[i]["date"]);
							$('tbody tr:last td:eq(4)').html(mes[i]["temperature"]);
							$('tbody tr:last td:eq(5)').html(mes[i]["vibration"]);
							$('tbody tr:last td:eq(6)').html(mes[i]["longitude"]);
							$('tbody tr:last td:eq(7)').html(mes[i]["latitude"]);
							$('tbody tr:last td:eq(8)').html(mes[i]["altitude"]);
								$('tbody tr:last td:eq(9)').html("999m");//海拔显示默认值
						//	$('tbody tr:last td:eq(9)').html(mes[i]["num"]);							
						//	$('tbody tr:last td:eq(9)').html(mes[i]["longitude"						
							//colseZz();
							//addColor();
	}
}

var idTmr;
        function  getExplorer() {
            var explorer = window.navigator.userAgent ;
            //ie
            if (explorer.indexOf("MSIE") >= 0) {
                return 'ie';
            }
            //firefox
            else if (explorer.indexOf("Firefox") >= 0) {
                return 'Firefox';
            }
            //Chrome
            else if(explorer.indexOf("Chrome") >= 0){
                return 'Chrome';
            }
            //Opera
            else if(explorer.indexOf("Opera") >= 0){
                return 'Opera';
            }
            //Safari
            else if(explorer.indexOf("Safari") >= 0){
                return 'Safari';
            }
        }
        function method5(tableid) {
            if(getExplorer()=='ie')
            {
                var curTbl = document.getElementById(tableid);
                var oXL = new ActiveXObject("Excel.Application");
                var oWB = oXL.Workbooks.Add();
                var xlsheet = oWB.Worksheets(1);
                var sel = document.body.createTextRange();
                sel.moveToElementText(curTbl);
                sel.select();
                sel.execCommand("Copy");
                xlsheet.Paste();
                oXL.Visible = true;

                try {
                    var fname = oXL.Application.GetSaveAsFilename("Excel.xls", "Excel Spreadsheets (*.xls), *.xls");
                } catch (e) {
                    print("Nested catch caught " + e);
                } finally {
                    oWB.SaveAs(fname);
                    oWB.Close(savechanges = false);
                    oXL.Quit();
                    oXL = null;
                    idTmr = window.setInterval("Cleanup();", 1);
                }

            }
            else
            {
                tableToExcel(tableid)
            }
        }
        function Cleanup() {
            window.clearInterval(idTmr);
            CollectGarbage();
        }
        var tableToExcel = (function() {
            var uri = 'data:application/vnd.ms-excel;base64,',
                    template = '<html><head><meta charset="UTF-8"></head><body><table>{table}</table></body></html>',
                    base64 = function(s) { return window.btoa(unescape(encodeURIComponent(s))) },
                    format = function(s, c) {
                        return s.replace(/{(\w+)}/g,
                                function(m, p) { return c[p]; }) }
            return function(table, name) {
                if (!table.nodeType) table = document.getElementById(table)
                var ctx = {worksheet: name || 'Worksheet', table: table.innerHTML}
                window.location.href = uri + base64(format(template, ctx))
            }
        })()


		