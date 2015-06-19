create index IX_3DE322F6 on datasourceInfosys_Allgemeines (statusbericht_id);

create index IX_D0D1E483 on datasourceInfosys_Feedback (student_id);
create index IX_D07760FE on datasourceInfosys_Feedback (student_id, feedback_runden_nr);

create index IX_F5BE8712 on datasourceInfosys_Geplante_arbeit (statusbericht_id);

create index IX_AB53CB4B on datasourceInfosys_Project (projecthskaId);

create index IX_25A82A43 on datasourceInfosys_Statusbericht_detail (statusbericht_id);

create index IX_D1DD8E16 on datasourceInfosys_Statusbericht_geplante_arbeit (statusbericht_id);

create index IX_43F35A60 on datasourceInfosys_Statusbericht_info (statusbericht_id);

create index IX_7C7A28A2 on datasourceInfosys_Statusberichte (project_id);

create index IX_47B53F90 on datasourceInfosys_Statusueberblick (statusbericht_id);

create index IX_5C8736C8 on datasourceInfosys_Student (projectId);
create index IX_3598C8B1 on datasourceInfosys_Student (project_id);
create index IX_9EF8718B on datasourceInfosys_Student (studenthskaId);

create index IX_B4FCB922 on datasourceInfosys_Students_Projects (projectId);
create index IX_79568F44 on datasourceInfosys_Students_Projects (studentId);

create index IX_EC75BCF4 on datasourceInfosys_Teilnote (feedback_id);

create index IX_9F9E5746 on datasourceInfosys_Teilnote_feedback (feedback_id);
create index IX_2B4D37EA on datasourceInfosys_Teilnote_feedback (feedback_id, bewertungskriterium_id);