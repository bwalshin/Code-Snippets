DI - TBMA

(Original)
ROUND({GS - DI - Allocated the recommended FTE % per project schedule requirements}+{GS - DI - Consistently meets project assignment deadlines}+{GS - DI - Registered and on path to complete RTBMA certification prior to FPO}+{GS - DI - Understands the functional Finance/IT landscape and extended team SME “who to call list”}+{GS - DI - Demonstrated desire to learn Apptio, TBM discipline, and willingness to engage in configuration effort},0)

(Xander)
ROUND(SUM({GS - DI - Allocated the recommended FTE % per project schedule requirements},{GS - DI - Consistently meets project assignment deadlines},{GS - DI - Registered and on path to complete RTBMA certification prior to FPO},{GS - DI - Understands the functional Finance/IT landscape and extended team SME “who to call list”},{GS - DI - Demonstrated desire to learn Apptio, TBM discipline, and willingness to engage in configuration effort}),0)

(Edited)
ROUND(
	IF(NUMBER({GS - DI - Allocated the recommended FTE % per project schedule requirements})="",0,NUMBER({GS - DI - Allocated the recommended FTE % per project schedule requirements})) + 
	IF(NUMBER({GS - DI - Consistently meets project assignment deadlines})="",0,NUMBER({GS - DI - Consistently meets project assignment deadlines})) + 
	IF(NUMBER({GS - DI - Registered and on path to complete RTBMA certification prior to FPO})="",0,NUMBER({GS - DI - Registered and on path to complete RTBMA certification prior to FPO})) + 
	IF(NUMBER({GS - DI - Understands the functional Finance/IT landscape and extended team SME “who to call list”})="",0,NUMBER({GS - DI - Understands the functional Finance/IT landscape and extended team SME “who to call list”})) + 
	IF(NUMBER({GS - DI - Demonstrated desire to learn Apptio, TBM discipline, and willingness to engage in configuration effort})="",0,NUMBER({GS - DI - Demonstrated desire to learn Apptio, TBM discipline, and willingness to engage in configuration effort})),0)

-----------------------

DI - Executive Sponsorship

(Original)
ROUND({GS - DI - Champions TBM and has communicated clear project initiative, objectives, goals and value drivers}+{GS - DI - Direct control or proven ability to influence and communicate impact to targeted Personas}+{GS - DI - Direct control or proven ability to influence data / system owners}+{GS - DI - Committed the recommended resources and % FTE to support project timeline and requirements}+{GS - DI - Consistently attends and is actively engaged in Steering Committee reviews}+{GS - DI - Has organizational leverage, willingness and commitment to drive change or process improvement},0)

(Edited)
ROUND(SUM({GS - DI - Champions TBM and has communicated clear project initiative, objectives, goals and value drivers}, {GS - DI - Direct control or proven ability to influence and communicate impact to targeted Personas}, {GS - DI - Direct control or proven ability to influence data / system owners}, {GS - DI - Committed the recommended resources and % FTE to support project timeline and requirements}, {GS - DI - Consistently attends and is actively engaged in Steering Committee reviews}, {GS - DI - Has organizational leverage, willingness and commitment to drive change or process improvement}),0)

(Edited)
ROUND(
	IF(NUMBER({GS - DI - Champions TBM and has communicated clear project initiative, objectives, goals and value drivers})="",0,NUMBER({GS - DI - Champions TBM and has communicated clear project initiative, objectives, goals and value drivers})) + 
	IF(NUMBER({GS - DI - Direct control or proven ability to influence and communicate impact to targeted Personas})="",0,NUMBER({GS - DI - Direct control or proven ability to influence and communicate impact to targeted Personas})) + 
	IF(NUMBER({GS - DI - Direct control or proven ability to influence data / system owners})=0,"",NUMBER({GS - DI - Direct control or proven ability to influence data / system owners})) + 
	IF(NUMBER({GS - DI - Committed the recommended resources and % FTE to support project timeline and requirements})="",0,NUMBER({GS - DI - Committed the recommended resources and % FTE to support project timeline and requirements})) + 
	IF(NUMBER({GS - DI - Consistently attends and is actively engaged in Steering Committee reviews})="",0,NUMBER({GS - DI - Consistently attends and is actively engaged in Steering Committee reviews})) + 
	IF(NUMBER({GS - DI - Has organizational leverage, willingness and commitment to drive change or process improvement})="",0,NUMBER({GS - DI - Has organizational leverage, willingness and commitment to drive change or process improvement})),0)

---------------------------------------
DI - Core and Extended team

(Original)
ROUND({GS - DI - Are allocated the recommended FTE % per project schedule requirements}+{GS - DI - Able to articulate current functional processes, business requirements, system and data landscape}+{GS - DI - Demonstrate understanding and willingness to adopt TBM best practices and drive change management}+{GS - DI - Spans IT and Finance}+{GS - DI - Accountable to schedule commitments, producing quality deliverables}+{GS - DI - Decisive and empowered members able to drive consensus when issues/challenges surface},0)

(Edited)
ROUND(SUM({GS - DI - Are allocated the recommended FTE % per project schedule requirements},{GS - DI - Able to articulate current functional processes, business requirements, system and data landscape},{GS - DI - Demonstrate understanding and willingness to adopt TBM best practices and drive change management},{GS - DI - Spans IT and Finance},{GS - DI - Accountable to schedule commitments, producing quality deliverables},{GS - DI - Decisive and empowered members able to drive consensus when issues/challenges surface}),0)

---------------------------------------
DI - Targeted FPO

(Original)
ROUND({GS - DI - Target FPO has been identified and is fundamentally aligned with project objectives}+{GS - DI - Executive Sponsor understands the capabilities and value of the FPO}+{GS - DI - Executive Sponsor supports the decision to roll out FPO}+{GS - DI - Target FPO data is defensible or sponsor has confidence in managing data/allocation objections}+{GS - DI - FPO schedule is defined and resources are committed to roll out FPO}+{GS - DI - FPO is replacing an existing process},0)

(Edited)
ROUND(SUM({GS - DI - Target FPO has been identified and is fundamentally aligned with project objectives},{GS - DI - Executive Sponsor understands the capabilities and value of the FPO},{GS - DI - Executive Sponsor supports the decision to roll out FPO},{GS - DI - Target FPO data is defensible or sponsor has confidence in managing data/allocation objections},{GS - DI - FPO schedule is defined and resources are committed to roll out FPO},{GS - DI - FPO is replacing an existing process}),0)

---------------------------------------
DI - Data

(Original)
ROUND({GS - DI - Data SMEs and source systems have been identified for current phase of project work}+{GS - DI - Data requirements review and collection are progressing per schedule}+{GS - DI - Effort to obtain and maintain data recurring mapping, user driven allocations, etc. is reasonable and sustainable}+{GS - DI - Initial review of data received supports configuration for targeted use cases or FPO realization}+{GS - DI - Data quality does not require significant effort to improve solution confidence and usage},0)

(Edited)
ROUND(SUM({GS - DI - Data SMEs and source systems have been identified for current phase of project work},{GS - DI - Data requirements review and collection are progressing per schedule},{GS - DI - Effort to obtain and maintain data recurring mapping, user driven allocations, etc. is reasonable and sustainable},{GS - DI - Initial review of data received supports configuration for targeted use cases or FPO realization},{GS - DI - Data quality does not require significant effort to improve solution confidence and usage}),0)

---------------------------------------
DI - Product Configuration

(Original)
ROUND({GS - DI - Product configuration activities are aligned with SOW expectations what was sold}+{GS - DI - Few, if any, objections have been communicated regarding solution ease of use}+{GS - DI - Requested capabilities align to Platform or Application capabilities degree of fit}+{GS - DI - Allocation strategies are being reviewed and validated by authorized client stakeholders and sponsors}+{GS - DI - Support issues performance, bugs, etc. have been identified AND Issue resolution is impacting project progress or status}+{GS - DI - Solution is defensible or sponsor has confidence in managing data/allocation objections},0)

(Edited)
ROUND(SUM({GS - DI - Product configuration activities are aligned with SOW expectations what was sold},{GS - DI - Few, if any, objections have been communicated regarding solution ease of use},{GS - DI - Requested capabilities align to Platform or Application capabilities degree of fit},{GS - DI - Allocation strategies are being reviewed and validated by authorized client stakeholders and sponsors},{GS - DI - Support issues performance, bugs, etc. have been identified AND Issue resolution is impacting project progress or status},{GS - DI - Solution is defensible or sponsor has confidence in managing data/allocation objections}),0)

---------------------------------------
DI - Organizational Readiness

(Original)
ROUND({GS - DI - Data loading has been automated for critical business systems Finance, CMDB, etc.}+{GS - DI - Data governance, monthly calendar, and load process has been defined and implemented}+{GS - DI - An existing process/review is being decommissioned or retired by Apptio capabilities or A new process/review is being deployed}+{GS - DI - Targeted end user personas have been trained on recurring usage of Apptio capabilities}+{GS - DI - Project schedule for rollout has been approved by Sponsor, with a clear Go-Live date}+{GS - DI - TBM Office is defined and driving necessary change management and communication}+{GS - DI - TBMA has demonstrated proficiency in business administration tasks, configuration maintenance and is capable of carrying Apptio forward},0)

(Edited)
ROUND(SUM({GS - DI - Data loading has been automated for critical business systems Finance, CMDB, etc.},{GS - DI - Data governance, monthly calendar, and load process has been defined and implemented},{GS - DI - An existing process/review is being decommissioned or retired by Apptio capabilities or A new process/review is being deployed},{GS - DI - Targeted end user personas have been trained on recurring usage of Apptio capabilities},{GS - DI - Project schedule for rollout has been approved by Sponsor, with a clear Go-Live date},{GS - DI - TBM Office is defined and driving necessary change management and communication},{GS - DI - TBMA has demonstrated proficiency in business administration tasks, configuration maintenance and is capable of carrying Apptio forward}),0)

---------------------------------------
DI - Overall

(Original)
ROUND(AVERAGE({Delivery Index - TBMA},{Delivery Index - Executive Sponsorship},{Delivery Index - Core and Extended Team},{Delivery Index - Targeted FPO},{Delivery Index - Data},{Delivery Index - Product Configuration},{Delivery Index - Organizational Readiness}),0)