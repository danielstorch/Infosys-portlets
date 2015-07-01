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

create table datasourceInfosys_Project (
	name VARCHAR(75) null,
	projecthskaId VARCHAR(75) null,
	id_ LONG not null primary key
);

create table datasourceInfosys_Rolle (
	id_ LONG not null primary key,
	shortName VARCHAR(75) null,
	name VARCHAR(75) null
);

create table datasourceInfosys_Statusbericht_detail (
	id_ LONG not null primary key,
	text_ VARCHAR(1000) null,
	statusbericht_id LONG,
	statusbericht_detail_punkt_id LONG
);

create table datasourceInfosys_Statusbericht_detail_punkt (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table datasourceInfosys_Statusbericht_geplante_arbeit (
	id_ LONG not null primary key,
	aktivitaet VARCHAR(1000) null,
	bis_wann DATE null,
	statusbericht_id LONG,
	verantwortlicher LONG
);

create table datasourceInfosys_Statusbericht_info (
	id_ LONG not null primary key,
	bemerkung VARCHAR(75) null,
	status INTEGER,
	statusbericht_id LONG,
	statusbericht_info_punkt_id LONG
);

create table datasourceInfosys_Statusbericht_info_punkt (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table datasourceInfosys_Statusberichte (
	id_ LONG not null primary key,
	project_id LONG,
	datum DATE null,
	kalenderwoche INTEGER
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

create table datasourceInfosys_Teilnote_feedback (
	id_ LONG not null primary key,
	feedback_id LONG,
	note INTEGER,
	bewertungskriterium_id LONG
);