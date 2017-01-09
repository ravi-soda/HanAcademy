SELECT * FROM HAN.TESTDB.ADMIN_USER

/* USER TABLES */

CREATE TABLE HAN.TESTDB.ADMIN_USER(
	adminUserID INTEGER,
	adminUsername VARCHAR(50), 
    adminPassword VARCHAR(50), 
    createdDate datetime,
	CONSTRAINT adminUser_pk PRIMARY KEY
	)

CREATE TABLE HAN.TESTDB.STUDENTS (
      studID INTEGER, 
      studName VARCHAR(250), 
      studAge INTEGER,
      studGradeID INTEGER,
      studEmail VARCHAR(250),
      
      createdBy INTEGER,
      createdDate DATETIME,
      updatedBy INTEGER,
      updatedDate DATETIME
      )

CREATE TABLE HAN.TESTDB.PARENT_USER (
      parentID INTEGER,
      firstName VARCHAR(100),
      lastName VARCHAR(100),
      emailID VARCHAR(100),
      phoneNumber VARCHAR(30),
      faxNo VARCHAR(30),
      parentUsername VARCHAR(50),
      parentPassword VARCHAR(50),
      firstTimeLogin BIT,
      
      createdDate DATETIME
)

CREATE TABLE HAN.TESTDB.PARENT_STUDENT_MAP (
	parentStudID INTEGER,
	parentID INTEGER,
	studID INTEGER,
	
	createdDate DATETIME
)

CREATE TABLE HAN.TESTDB.NEWS(
	newsID INTEGER,
	newsTitle VARCHAR(150),
	newsDesc VARCHAR(300),
	stDate datetime,
	endDate datetime,
	createdBy INTEGER,
	createdDate datetime,
	updatedBy INTEGER,
	updatedDate datetime
	)
	
	
CREATE TABLE HAN.TESTDB.COURSES(
	courseID INTEGER,
	courseName VARCHAR(100),
    courseDesc VARCHAR(300),
      
	createdBy INTEGER,
	createdDate datetime,
	updatedBy INTEGER,
	updatedDate datetime
	)
	
CREATE TABLE HAN.TESTDB.COURSE_SUBJECT_MAP(
	courseSubMapID INTEGER,
	courseID INTEGER,
	subjID INTEGER,
	
	createdBy INTEGER,
	createdDate datetime,
	updatedBy INTEGER,
	updatedDate datetime
	)
	
CREATE TABLE HAN.TESTDB.SUBJECTS(
	subjID INTEGER,
    subjTitle VARCHAR(150),
	subjDesc VARCHAR(300),
    subjCost MONEY,
	
	createdBy INTEGER,
	createdDate datetime,
	updatedBy INTEGER,
	updatedDate datetime
	)
	
CREATE TABLE HAN.TESTDB.SCHEDULES (
	schID INTEGER,
	schTitle VARCHAR(150),
    schDesc VARCHAR(1000),
      
	createdBy INTEGER,
	createdDate datetime,
	updatedBy INTEGER,
	updatedDate datetime
	)
	
	
CREATE TABLE HAN.TESTDB.GRADES(
	gradeID INTEGER,
	gradeTitle VARCHAR(30)
	)
	
CREATE TABLE HAN.TESTDB.STUDENT_COURSE_MAP (
	studCourseMapID INTEGER,
	studID INTEGER,
	schID INTEGER
	)
	
	
CREATE TABLE HAN.TESTDB.PARENT_USER (
	parentID INTEGER,
    firstName VARCHAR(100),
    lastName VARCHAR(100),
    emailID VARCHAR(100),
    phoneNumber VARCHAR(30),
    faxNo VARCHAR(30),
    parentUsername VARCHAR(50),
    parentPassword VARCHAR(50),
	firstTimeLogin BIT,
      
    createdDate DATETIME
	)

CREATE TABLE HAN.TESTDB.REGISTRATION (
	regID INTEGER,
	schID INTEGER,
	parentID INTEGER,
	regOn datetime,
	regBy INTEGER,
	status VARCHAR(30),
	
	createdBy INTEGER,
	createdDate datetime,
	updatedBy INTEGER,
	updatedDate datetime
	)

CREATE TABLE HAN.TESTDB.REGISTRATION_INTERACTIONS (
	interactionID INTEGER,
	userID INTEGER,
	msg VARCHAR(500),
	regID INTEGER,
	
	createdDate datetime,
	)
