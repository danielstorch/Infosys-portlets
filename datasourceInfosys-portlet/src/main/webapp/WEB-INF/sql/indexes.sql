create index IX_3DE322F6 on datasourceInfosys_Allgemeines (statusbericht_id);

create index IX_D0D1E483 on datasourceInfosys_Feedback (student_id);

create index IX_F5BE8712 on datasourceInfosys_Geplante_arbeit (statusbericht_id);

create index IX_7C7A28A2 on datasourceInfosys_Statusberichte (project_id);

create index IX_47B53F90 on datasourceInfosys_Statusueberblick (statusbericht_id);

create index IX_5C8736C8 on datasourceInfosys_Student (projectId);
create index IX_3598C8B1 on datasourceInfosys_Student (project_id);

create index IX_B4FCB922 on datasourceInfosys_Students_Projects (projectId);
create index IX_79568F44 on datasourceInfosys_Students_Projects (studentId);

create index IX_EC75BCF4 on datasourceInfosys_Teilnote (feedback_id);