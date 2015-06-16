create table datasourceInfosys_Allgemeines (
	id_ LONG not null primary key,
	statusbericht_id LONG,
	probleme_risiken VARCHAR(75) null,
	massnahmen VARCHAR(75) null,
	situation VARCHAR(500) null,
	gruende VARCHAR(75) null
);

create table datasourceInfosys_Bewertungskriterium (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	beschreibung VARCHAR(75) null,
	gewichtung INTEGER
);

create table datasourceInfosys_Feedback (
	id_ LONG not null primary key,
	student_id LONG,
	feedback_runden_nr INTEGER,
	eigenbewertung VARCHAR(75) null,
	kommentar_kompetenzen VARCHAR(75) null,
	kommentar_beitrag VARCHAR(75) null,
	beitrag INTEGER
);

create table datasourceInfosys_Geplante_arbeit (
	id_ LONG not null primary key,
	statusbericht_id LONG,
	verantwortlicher LONG,
	arbeit VARCHAR(75) null,
	bis_wann DATE null
);

create table datasourceInfosys_Project (
	name VARCHAR(75) null,
	projecthskaId VARCHAR(75) null,
	id_ LONG not null primary key
);

create table datasourceInfosys_Statusberichte (
	id_ LONG not null primary key,
	project_id LONG,
	datum DATE null,
	kalenderwoche INTEGER
);

create table datasourceInfosys_Statusueberblick (
	id_ LONG not null primary key,
	statusbericht_id LONG,
	qualitaet_status VARCHAR(75) null,
	qualitaet_text VARCHAR(75) null,
	kosten_text VARCHAR(75) null,
	kosten_status VARCHAR(75) null,
	aufwand_status VARCHAR(75) null,
	aufwand_text VARCHAR(75) null,
	termine_status VARCHAR(75) null,
	termine_text VARCHAR(75) null
);

create table datasourceInfosys_Student (
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	id_ LONG not null primary key,
	project_id LONG,
	studenthskaId VARCHAR(75) null,
	matnr LONG,
	role LONG
);

create table datasourceInfosys_Students_Projects (
	projectId LONG not null,
	studentId LONG not null,
	primary key (projectId, studentId)
);

create table datasourceInfosys_Teilnote (
	id_ LONG not null primary key,
	feedback_id LONG,
	note INTEGER,
	kategorie LONG
);

create table datasourceInfosys_Teilnote_feedback (
	id_ LONG not null primary key,
	feedback_id LONG,
	note INTEGER,
	bewertungskriterium_id LONG
);