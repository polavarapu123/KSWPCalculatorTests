$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/KSCalculatorInfoIcons.feature");
formatter.feature({
  "name": "Information Icons present for all fields in the KiwiSaver Retirement Calculator",
  "description": " As a Product Owner\n I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present\nSo that the user is able to get a clear understanding of what needs to be entered in the field .\n file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate that clicking Information icon for the Current Age field displayes expected message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@major"
    }
  ]
});
formatter.step({
  "name": "user is on the Kiwisaver Retirement Calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_is_on_the_Kiwisaver_Retirement_Calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Information icon besides Current Age field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_clicks_on_Information_icon_besides_Current_Age_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected help message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.expected_help_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Information icon besides Employment status",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_clicks_on_Information_icon_besides_Employment_status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expeceted employment status help text is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.expeceted_employment_status_help_text_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Information icon besides Current KiwiSavebalance field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_clicks_on_Information_icon_besides_Current_KiwiSavebalance_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expecetd kiwisaver balance help text is dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.expecetd_kiwisaver_balance_help_text_is_dispalyed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Information icon besides voluntary contributions",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_clicks_on_Information_icon_besides_voluntary_contributions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected volunatry contribution help text is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.expected_volunatry_contribution_help_text_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Information icon besides RiskProfile field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_clicks_on_Information_icon_besides_RiskProfile_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected riskProfile help information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.expected_riskProfile_help_information_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Information icon besides savings goal at retirement field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.user_clicks_on_Information_icon_besides_savings_goal_at_retirement_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "expected savings goal at retirement help text is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KSCalculatorInfoIcons.expected_savings_goal_at_retirement_help_text_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/KiwisaverBalance.feature");
formatter.feature({
  "name": "Calculate KiwiSaver projected balance",
  "description": "As a Product Owner,I want that the KiwiSaver Retirement Calculator self employed users are able to calculate what their KiwiSaver projected balance would be at retirement\nSo that the users are able to plan their investments better",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Employed users Projected Balance at age 30",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@major"
    }
  ]
});
formatter.step({
  "name": "user is on the Kiwisaver Retirement Calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.KiwisaverBalance.user_is_on_the_Kiwisaver_Retirement_Calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "current age of the user is 30 years",
  "keyword": "And "
});
formatter.match({
  "location": "steps.KiwisaverBalance.current_age_of_the_user_is_years()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employment status of the user is Employed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.KiwisaverBalance.employment_status_of_the_user_is_Employed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types salary of 82000",
  "keyword": "And "
});
formatter.match({
  "location": "steps.KiwisaverBalance.user_types_salary_of()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects 4 percentage Kiwisaver memeber contribution",
  "keyword": "And "
});
formatter.match({
  "location": "steps.KiwisaverBalance.selects_percentage_Kiwisaver_memeber_contribution()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "chooses a Defensive risk profile",
  "keyword": "And "
});
formatter.match({
  "location": "steps.KiwisaverBalance.chooses_a_Defensive_risk_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on view your Kiwisaver Retirement Projections",
  "keyword": "When "
});
formatter.match({
  "location": "steps.KiwisaverBalance.user_clicks_on_view_your_Kiwisaver_Retirement_Projections()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see estimated Kiwisaver balance details",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.KiwisaverBalance.user_can_see_estimated_Kiwisaver_balance_details()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/NonEmployedKiwiSaver.feature");
formatter.feature({
  "name": "Calculate KiwiSaver projected balance",
  "description": "  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement\n  So that \n  The users are able to plan their investments better",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "kiwiSaver Balance for Non employed users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@major"
    }
  ]
});
formatter.step({
  "name": "user has navigated to WP KiwiSaver calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.user_has_navigated_to_WP_KiwiSaver_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "current age of user is 55 years",
  "keyword": "And "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.current_age_of_user_is_years()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employment status of user is Non-employed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.employment_status_of_user_is_Non_employed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Non-employed current KiwiSaver balance is $140000",
  "keyword": "And "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.non_employed_current_KiwiSaver_balance_is_$140000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Non-employedvoluntary contributes $10 Annually",
  "keyword": "And "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.non_employedvoluntary_contributes_$10_Anually()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Non-employed chooses a balanced risk profile",
  "keyword": "And "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.non_employed_chooses_a_balanced_risk_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Non-employed saving goals requirement of $200000",
  "keyword": "And "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.non_employed_saving_goals_requirement_of_$200000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Non-employed user clicks on view Kiwisaver Retirement Projections",
  "keyword": "When "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.non_employed_user_clicks_on_view_Kiwisaver_Retirement_Projections()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Non-employed user can see projected Kiwisaver balance details",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.NonEmployedKiwiSaver.non_employed_user_can_see_projected_Kiwisaver_balance_details()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SelfEmployedKS.feature");
formatter.feature({
  "name": "Calculate KiwiSaver projected balance",
  "description": "  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement\n  So that \n  The users are able to plan their investments better",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "kiwiSaver Balance for Self employed users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@major"
    }
  ]
});
formatter.step({
  "name": "user has navigated to KiwiSaver calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.user_has_navigated_to_KiwiSaver_calculator_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "current age of the user is 45 years",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.current_age_of_the_user_is_years()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employment status of the user is Self-employed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.employment_status_of_the_user_is_Self_employed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "current KiwiSaver balance is $100000",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.current_KiwiSaver_balance_is_$100000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "voluntary contributes $90 fortnightly",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.voluntary_contributes_$90_fortnightly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "chooses a Conservative risk profile",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.chooses_a_Conservative_risk_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "saving goals requirement of $290000",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.saving_goals_requirement_of_$290000()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on view Kiwisaver Retirement Projections",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.user_clicks_on_view_Kiwisaver_Retirement_Projections()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see projected Kiwisaver balance details",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SelfEmployedKiwiSaver.user_can_see_projected_Kiwisaver_balance_details()"
});
formatter.result({
  "status": "passed"
});
});