$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ExcelRead.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Multiple Logins in Facebook",
  "description": "",
  "id": "testing-multiple-logins-in-facebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3287864,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Reading Multiple Login Ids from Excel",
  "description": "",
  "id": "testing-multiple-logins-in-facebook;reading-multiple-login-ids-from-excel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "U r in facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Getting Values From Excel and Feeding to Facebook Login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Check Whether Logging in to Facebook And quit",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookFrmExcel.U_r_in_Facebook_Login_page()"
});
formatter.result({
  "duration": 200438905,
  "status": "passed"
});
formatter.match({
  "location": "FacebookFrmExcel.Getting_Values_From_Excel_and_Feeding_to_Facebook_Login()"
});
formatter.result({
  "duration": 54374717987,
  "status": "passed"
});
formatter.match({
  "location": "FacebookFrmExcel.Check_Whether_Logging_in_to_Facebook_And_quit()"
});
formatter.result({
  "duration": 576536998,
  "status": "passed"
});
formatter.after({
  "duration": 21734,
  "status": "passed"
});
});