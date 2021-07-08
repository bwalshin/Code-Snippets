// Delivery health v2 code //
//
////////////////////////////////////////////////
// Section - TBMO Resources  Status Condition //
////////////////////////////////////////////////
IF(Project Current Phase = "Discover and Plan" && { RAG - FTEs Percent is below requirements}="AMBER" || { RAG - Team lacks empowerment and deadlines constantly missed}="AMBER" || { RAG - TBMA is not trained}="AMBER", "AMBER",

    IF(Project Current Phase = "Configure" && { RAG - FTEs Percent is below requirements}="RED" || { RAG - Team lacks empowerment and deadlines constantly missed}="RED" || { RAG - TBMA is not trained}="RED", "RED",

        IF(Project Current Phase = "Rollout" && { RAG - FTEs Percent is below requirements}="RED" || { RAG - Team lacks empowerment and deadlines constantly missed}="RED" || { RAG - TBMA is not trained}="RED", "RED",
            "GREEN")))

// Field - Allocated FTEs Percent is below the project schedule requirements
IF(Allocated FTEs Percent is below the project schedule requirements = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF(Allocated FTEs Percent is below the project schedule requirements = "Yes" && Project Current Phase = "Configure", "AMBER",
        IF(Allocated FTEs Percent is below the project schedule requirements = "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

// Field - Team members lack empowerment for consensus or decisions and deadlines constantly missed
IF(Team members lack empowerment for consensus or decisions and deadlines constantly missed = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF(Team members lack empowerment for consensus or decisions and deadlines constantly missed = "Yes" && Project Current Phase = "Configure", "RED",
        IF(Team members lack empowerment for consensus or decisions and deadlines constantly missed = "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

// Field - TBMA is not trained or progressing with training as expected
IF(TBMA is not trained or progressing with training as expected= "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF(TBMA is not trained or progressing with training as expected= "Yes" && Project Current Phase = "Configure", "AMBER",
        IF(TBMA is not trained or progressing with training as expected= "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

///////////////////////////
// Section - Data Status //
///////////////////////////
IF(Project Current Phase = "Discover and Plan" && { RAG - Significant delays in engagement, data review, and collection}="AMBER" || { RAG - Data automation is not an option}="AMBER", "AMBER",

    IF(Project Current Phase = "Configure" && { RAG - Significant delays in engagement, data review, and collection}="RED" || { RAG - Data automation is not an option}="RED", "RED",
        IF(Project Current Phase = "Configure" && { RAG - Solution value are negatively impacted by data quality for go - live}="AMBER", "AMBER",

            IF(Project Current Phase = "Rollout" && { RAG - Significant delays in engagement, data review, and collection}="RED" || { RAG - Data automation is not an option}="RED" || { RAG - Solution value are negatively impacted by data quality for go - live}="RED", "RED",
                "GREEN"))))

// Field - Significant delays in Data SMEs engagement, data review, and collection
IF({ Significant delays in Data SMEs engagement, data review, and collection } = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF({ Significant delays in Data SMEs engagement, data review, and collection } = "Yes" && Project Current Phase = "Configure", "RED",
        IF({ Significant delays in Data SMEs engagement, data review, and collection } = "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

// Field - Solution confidence, usage, and perceived value are negatively impacted by data quality for go-live
IF(Project Current Phase = "Discover and Plan", "N/A",
    IF({ Solution confidence, usage, and perceived value are negatively impacted by data quality for go - live } = "Yes" && Project Current Phase = "Discover and Plan", "N/A",
        IF({ Solution confidence, usage, and perceived value are negatively impacted by data quality for go - live } = "Yes" && Project Current Phase = "Configure", "AMBER",
            IF({ Solution confidence, usage, and perceived value are negatively impacted by data quality for go - live } = "Yes" && Project Current Phase = "Rollout", "RED",
                "GREEN"))))

// Field - Data automation is not an option e.g. Ingress or Egress
IF({ Data automation is not an option e.g.Ingress or Egress } = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF({ Data automation is not an option e.g.Ingress or Egress } = "Yes" && Project Current Phase = "Configure", "AMBER",
        IF({ Data automation is not an option e.g.Ingress or Egress } = "Yes" && Project Current Phase = "Rollout", "AMBER",
            "GREEN")))

/////////////////////////////////
// Section - Executive Sponsor //
////////////////////////////////
IF(Project Current Phase = "Discover and Plan" && { RAG - Does not attend and is not engaged in Exec reviews}="AMBER" || { RAG - No leverage, willingness, and commitment to drive change or process improvement}="AMBER", "AMBER",

    IF(Project Current Phase = "Configure" && { RAG - Does not attend and is not engaged in Exec reviews}="RED", "RED",
        IF(Project Current Phase = "Configure" && { RAG - No leverage, willingness, and commitment to drive change or process improvement}="AMBER", "AMBER",

            IF(Project Current Phase = "Rollout" && { RAG - Does not attend and is not engaged in Exec reviews}="RED" || { RAG - No leverage, willingness, and commitment to drive change or process improvement}="RED", "RED",
                "GREEN"))))

// Field - Does not consistently attend and is not actively engaged in Exec reviews
IF(Does not consistently attend and is not actively engaged in Exec reviews = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF(Does not consistently attend and is not actively engaged in Exec reviews = "Yes" && Project Current Phase = "Configure", "RED",
        IF(Does not consistently attend and is not actively engaged in Exec reviews = "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

// Field - Does not consistently attend and is not actively engaged in Exec reviews
IF({ Does not have the organizational leverage, willingness, and commitment to drive change or process improvement } = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF({ Does not have the organizational leverage, willingness, and commitment to drive change or process improvement } = "Yes" && Project Current Phase = "Configure", "RED",
        IF({ Does not have the organizational leverage, willingness, and commitment to drive change or process improvement } = "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

//////////////////////////////////////////////////////
// Section - Adoption Status Organization Readiness //
/////////////////////////////////////////////////////
IF(Project Current Phase = "Discover and Plan" && { RAG - Not prepared to rollout}="AMBER" || { RAG - No baseline process discussed or understood}="AMBER", "AMBER",

    IF(Project Current Phase = "Configure" && { RAG - Not prepared to rollout}="RED" || { RAG - No baseline process discussed or understood}="RED", "RED",

        IF(Project Current Phase = "Rollout" && { RAG - Not prepared to rollout}="RED" || { RAG - No baseline process discussed or understood}="RED", "RED",
            "GREEN")))

// Field - Not prepared to rollout. No Change agent / No comms plan / No Rollout plan
IF({ Not prepared to rollout.No Change agent / No comms plan / No Rollout plan}="Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF({ Not prepared to rollout.No Change agent / No comms plan / No Rollout plan}="Yes" && Project Current Phase = "Configure", "AMBER",
        IF({ Not prepared to rollout.No Change agent / No comms plan / No Rollout plan}="Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

// Field - No baseline process or use cases discussed or understood
IF(No baseline process or use cases discussed or understood = "Yes" && Project Current Phase = "Discover and Plan", "AMBER",
    IF(No baseline process or use cases discussed or understood = "Yes" && Project Current Phase = "Configure", "RED",
        IF(No baseline process or use cases discussed or understood = "Yes" && Project Current Phase = "Rollout", "RED",
            "GREEN")))

///////////////////////////////////
// Section - Product Challenges //
/////////////////////////////////
..

// Field - There are Product Gaps or missing functionality with no workaround available
IF(Project Current Phase = "Discover and Plan", "N/A",
    IF({ There are Product Gaps or missing functionality with no workaround available } = "Yes" && Project Current Phase = "Discover and Plan", "N/A",
        IF({ There are Product Gaps or missing functionality with no workaround available } = "Yes" && Project Current Phase = "Configure", "RED",
            IF({ There are Product Gaps or missing functionality with no workaround available } = "Yes" && Project Current Phase = "Rollout", "RED",
                "GREEN"))))

// Field - Team is spending significant time on workarounds to address product gaps

// Field - Apptio Platform performance is negatively impacting client or delivery

// Field - Client has been in Technical escalation for more then 3 wks

///////////////////////////////////
// Section - Deviation from CSP //
/////////////////////////////////
..

// Field - MVP for CSP not met before UC alignment

// Field - Data provided will not meet CSP outcome/success criteria

// Field - Validated Use Case does not align to CSP Biz Outcome/success criteria