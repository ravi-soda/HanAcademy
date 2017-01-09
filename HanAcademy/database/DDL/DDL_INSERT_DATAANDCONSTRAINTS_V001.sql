/* add not null key constraints */
ALTER TABLE HAN.TESTDB.STUDENTS ALTER COLUMN studID INTEGER NOT NULL  
ALTER TABLE HAN.TESTDB.PARENT_USER ALTER COLUMN parentID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.PARENT_STUDENT_MAP ALTER COLUMN parentStudID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.PARENT_STUDENT_MAP ALTER COLUMN parentID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.PARENT_STUDENT_MAP ALTER COLUMN studID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.NEWS	ALTER COLUMN newsID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.COURSES ALTER COLUMN courseID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.COURSE_SUBJECT_MAP ALTER COLUMN courseSubMapID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.SUBJECTS ALTER COLUMN subjID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.SCHEDULES ALTER COLUMN schID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.GRADES ALTER COLUMN gradeID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.STUDENT_COURSE_MAP ALTER COLUMN studCourseMapID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.PARENT_USER ALTER COLUMN parentID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.REGISTRATION ALTER COLUMN regID INTEGER NOT NULL
ALTER TABLE HAN.TESTDB.REGISTRATION_INTERACTIONS ALTER COLUMN interactionID INTEGER NOT NULL

/* add primary key constraints */
ALTER TABLE HAN.TESTDB.STUDENTS ADD CONSTRAINT student_pk PRIMARY KEY (studID)
ALTER TABLE HAN.TESTDB.PARENT_USER ADD CONSTRAINT parentUser_pk PRIMARY KEY (parentID)
ALTER TABLE HAN.TESTDB.PARENT_STUDENT_MAP ADD CONSTRAINT parentStudMap_pk PRIMARY KEY (parentStudID)
ALTER TABLE HAN.TESTDB.NEWS ADD CONSTRAINT news_pk PRIMARY KEY (newsID)
ALTER TABLE HAN.TESTDB.COURSES ADD CONSTRAINT courses_pk PRIMARY KEY (courseID)
ALTER TABLE HAN.TESTDB.COURSE_SUBJECT_MAP ADD CONSTRAINT courseSchMap_pk PRIMARY KEY (courseSubMapID)
ALTER TABLE HAN.TESTDB.SUBJECTS ADD CONSTRAINT subjects_pk PRIMARY KEY (subjID)
ALTER TABLE HAN.TESTDB.SCHEDULES ADD CONSTRAINT schedules_pk PRIMARY KEY (schID)
ALTER TABLE HAN.TESTDB.GRADES ADD CONSTRAINT grades_pk PRIMARY KEY (gradeID)
ALTER TABLE HAN.TESTDB.STUDENT_COURSE_MAP ADD CONSTRAINT studCourseMap_pk PRIMARY KEY (studCourseMapID)
ALTER TABLE HAN.TESTDB.PARENT_USER ADD CONSTRAINT parent_pk PRIMARY KEY (parentID)
ALTER TABLE HAN.TESTDB.REGISTRATION ADD CONSTRAINT reg_pk PRIMARY KEY (regID)
ALTER TABLE HAN.TESTDB.REGISTRATION_INTERACTIONS ADD CONSTRAINT regInteraction_pk PRIMARY KEY (interactionID)

/* add foreign key constraints */
/*
	student -> studGradeID
	parent_student_map -> parentID, studID
	COURSE_SUBJECT_MAP -> couseID, subjID
	STUDENT_COURSE_MAP -> studID, schID
	REGISTRATION_INTERACTIONS -> regID
*/

ALTER TABLE HAN.TESTDB.STUDENTS ADD CONSTRAINT studGradeID_fk FOREIGN KEY (studGradeID) REFERENCES HAN.TESTDB.GRADES(gradeID)

ALTER TABLE HAN.TESTDB.PARENT_STUDENT_MAP ADD CONSTRAINT parentStudMap_parentID_fk FOREIGN KEY (parentID) REFERENCES HAN.TESTDB.PARENT_USER(parentID)
ALTER TABLE HAN.TESTDB.PARENT_STUDENT_MAP ADD CONSTRAINT parentStudMap_studID_fk FOREIGN KEY (studID) REFERENCES HAN.TESTDB.STUDENTS(studID)

ALTER TABLE HAN.TESTDB.COURSE_SUBJECT_MAP ADD CONSTRAINT courseSubj_courseID_fk FOREIGN KEY (courseID) REFERENCES HAN.TESTDB.COURSES(courseID)
ALTER TABLE HAN.TESTDB.COURSE_SUBJECT_MAP ADD CONSTRAINT courseSubj_subjID_fk FOREIGN KEY (subjID) REFERENCES HAN.TESTDB.SUBJECTS(subjID)

ALTER TABLE HAN.TESTDB.STUDENT_COURSE_MAP ADD CONSTRAINT studCourseMap_suudID_fk FOREIGN KEY (stuID) REFERENCES HAN.TESTDB.STUDENTS(studID)
ALTER TABLE HAN.TESTDB.STUDENT_COURSE_MAP ADD CONSTRAINT studCourseMap_courseID_fk FOREIGN KEY (schID) REFERENCES HAN.TESTDB.SCHEDULES(schID)

ALTER TABLE HAN.TESTDB.REGISTRATION_INTERACTIONS ADD CONSTRAINT regInterc_regID_fk FOREIGN KEY (regID) REFERENCES HAN.TESTDB.REGISTRATION(regID)