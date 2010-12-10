/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.0.67-community-nt : Database - siec
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`siec` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `siec`;

/*Table structure for table `presesion_maestro` */

DROP TABLE IF EXISTS `presesion_maestro`;

CREATE TABLE `presesion_maestro` (
  `idpresesion_maestro` int(11) NOT NULL auto_increment,
  `tr_presesion__ID` int(11) NOT NULL,
  `tr_maestros_ID` int(11) NOT NULL,
  PRIMARY KEY  (`idpresesion_maestro`),
  KEY `fk_presesion_maestro_tr_presesion1` (`tr_presesion__ID`),
  KEY `fk_presesion_maestro_tr_maestros1` (`tr_maestros_ID`),
  CONSTRAINT `fk_presesion_maestro_tr_maestros1` FOREIGN KEY (`tr_maestros_ID`) REFERENCES `tr_maestros` (`MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_presesion_maestro_tr_presesion1` FOREIGN KEY (`tr_presesion__ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `presesion_maestro` */

/*Table structure for table `tc_carrera` */

DROP TABLE IF EXISTS `tc_carrera`;

CREATE TABLE `tc_carrera` (
  `CARRERA_ID` int(11) NOT NULL auto_increment,
  `DES_CARRERA` varchar(45) default NULL,
  PRIMARY KEY  (`CARRERA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `tc_carrera` */

insert  into `tc_carrera`(`CARRERA_ID`,`DES_CARRERA`) values (1,'ISEI'),(2,'MECATRONICA'),(3,'ELECTRONICA'),(4,'ENERGIAS'),(5,'LANI'),(6,'INDUSTRIAL'),(7,'MECANICA');

/*Table structure for table `tc_categorias` */

DROP TABLE IF EXISTS `tc_categorias`;

CREATE TABLE `tc_categorias` (
  `CATEGORIA_ID` int(11) NOT NULL auto_increment,
  `DES_CATEGORIA` varchar(45) default NULL,
  `DESCRIPCION` varchar(255) default NULL,
  `ORDEN` int(11) default NULL,
  PRIMARY KEY  (`CATEGORIA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tc_categorias` */

insert  into `tc_categorias`(`CATEGORIA_ID`,`DES_CATEGORIA`,`DESCRIPCION`,`ORDEN`) values (1,'TEORIA','SE EVALUA LA PARTE TEORICA',1),(2,'PRACTICA','SE EVALUA LA APLICACION DE LA TEORIA',2);

/*Table structure for table `tc_competencias` */

DROP TABLE IF EXISTS `tc_competencias`;

CREATE TABLE `tc_competencias` (
  `COMPETENCIA_ID` int(11) NOT NULL auto_increment,
  `DES_COMPETENCIA` varchar(45) default NULL,
  `DESCRIPCION` varchar(255) default NULL,
  `CATEGORIA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`COMPETENCIA_ID`),
  KEY `fk_TC_COMPETENCIAS_CATEGORIAS` (`CATEGORIA_ID`),
  CONSTRAINT `fk_TC_COMPETENCIAS_CATEGORIAS` FOREIGN KEY (`CATEGORIA_ID`) REFERENCES `tc_categorias` (`CATEGORIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tc_competencias` */

insert  into `tc_competencias`(`COMPETENCIA_ID`,`DES_COMPETENCIA`,`DESCRIPCION`,`CATEGORIA_ID`) values (1,'PROGRAMACIO ESTRUCTURADA','EL ALUMNO APRENDERA A REALIZAR CODIGOS CON UNA ESTRUCTURA ORDENADA Y LIMPIA TAMBIEN',2),(2,'MANEJO DE CISCO','EL ALIMNO APRENDERA A REALIZAR REDES EN LA HERRAMIENTA CISCO ',2),(3,'APRENDER ESTRATEGIAS DE DOCUMENTACION','EL ALUMNO APRENDERA A REALIZAR LA DOCUMENTACION NECESARIA PARA EL DESARROLLO DEL SOFTWARE',1),(4,'SOLUCION DE ECUACIONES','EL ALUMNO APRENDERA A RESOLVER ECUACIONES MEDIANTE DIFERENTES TIPOS DE SOLUCION',2),(5,'ABC','Nueva competencia',1);

/*Table structure for table `tc_criterios` */

DROP TABLE IF EXISTS `tc_criterios`;

CREATE TABLE `tc_criterios` (
  `CRITERIO_ID` int(11) NOT NULL auto_increment,
  `DES_CRITERIO` varchar(50) default NULL,
  `DESCRIPCION` varchar(255) default NULL,
  `Ponderacion` int(11) NOT NULL,
  PRIMARY KEY  (`CRITERIO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tc_criterios` */

insert  into `tc_criterios`(`CRITERIO_ID`,`DES_CRITERIO`,`DESCRIPCION`,`Ponderacion`) values (1,'REALIZAR METODS','EL ALUMNO APRENDERA A REALIZAR METODOS QUE PERMITAN COMPRENDER MAS UNCODIGO',0),(2,'CREACION DE CLASES','EL ALUMNO APRENDERA A REALIZAR CLASESY METODOS BASICOS PARA EL DESARROLLO DE SOFTWARE',0),(3,'PUNTUALIDAD','REALIZAR EN TIEMPO Y FORMA LAS ACTIVIDADES DE LA MATERIA',0),(4,'REALIZAR VLANS','EL ALUMNO APRENDERA EL CONCEPTO Y ELABORACION DE VLANS',0),(5,'ABC','Nuevo criterio',12);

/*Table structure for table `tc_departamentos` */

DROP TABLE IF EXISTS `tc_departamentos`;

CREATE TABLE `tc_departamentos` (
  `DEPARTAMENTO_ID` int(11) NOT NULL auto_increment,
  `DES_DEPARTAMENTO` varchar(45) default NULL,
  PRIMARY KEY  (`DEPARTAMENTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tc_departamentos` */

insert  into `tc_departamentos`(`DEPARTAMENTO_ID`,`DES_DEPARTAMENTO`) values (1,'MATEMATICAS'),(2,'IDIOMAS'),(3,'ISEI');

/*Table structure for table `tc_evaluacion_nivel` */

DROP TABLE IF EXISTS `tc_evaluacion_nivel`;

CREATE TABLE `tc_evaluacion_nivel` (
  `EVALUACION_NIVEL_ID` int(11) NOT NULL auto_increment,
  `DES_EVALUACION` varchar(45) default NULL,
  PRIMARY KEY  (`EVALUACION_NIVEL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tc_evaluacion_nivel` */

insert  into `tc_evaluacion_nivel`(`EVALUACION_NIVEL_ID`,`DES_EVALUACION`) values (1,'COMPETENTE'),(2,'BASICO'),(3,'INDEPENDIENTE'),(4,'AVANZADO'),(5,'INCOMPETENTE');

/*Table structure for table `tc_grupo` */

DROP TABLE IF EXISTS `tc_grupo`;

CREATE TABLE `tc_grupo` (
  `GRUPO_ID` int(11) NOT NULL auto_increment,
  `DES_GRUPO` varchar(45) default NULL,
  `CARRERA_ID` int(11) NOT NULL,
  `GRADO` varchar(45) default NULL,
  PRIMARY KEY  (`GRUPO_ID`),
  KEY `fk_TC_GRUPO_TC_CARRERA1` (`CARRERA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `tc_grupo` */

insert  into `tc_grupo`(`GRUPO_ID`,`DES_GRUPO`,`CARRERA_ID`,`GRADO`) values (4,'6',1,'A'),(5,'6',1,'B'),(6,'4',2,'B'),(7,'3',6,'A');

/*Table structure for table `tc_materias` */

DROP TABLE IF EXISTS `tc_materias`;

CREATE TABLE `tc_materias` (
  `MATERIAS_ID` int(11) NOT NULL auto_increment,
  `DES_MATERIAS` varchar(45) default NULL,
  `DEPARTAMENTO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`MATERIAS_ID`),
  KEY `fk_tc_materias_tc_departamentos1` (`DEPARTAMENTO_ID`),
  CONSTRAINT `fk_tc_materias_tc_departamentos1` FOREIGN KEY (`DEPARTAMENTO_ID`) REFERENCES `tc_departamentos` (`DEPARTAMENTO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tc_materias` */

insert  into `tc_materias`(`MATERIAS_ID`,`DES_MATERIAS`,`DEPARTAMENTO_ID`) values (1,'PROGRAMACION II',3),(2,'CALCULO INTEGRAL',1),(3,'INGLES VI',2),(4,'Programacion V',3);

/*Table structure for table `tc_perfil` */

DROP TABLE IF EXISTS `tc_perfil`;

CREATE TABLE `tc_perfil` (
  `PERFIL_ID` int(11) NOT NULL auto_increment,
  `DES_PERFIL` varchar(45) default NULL,
  PRIMARY KEY  (`PERFIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tc_perfil` */

insert  into `tc_perfil`(`PERFIL_ID`,`DES_PERFIL`) values (1,'Maestro'),(2,'Alumno'),(3,'Dpa'),(4,'Administrador');

/*Table structure for table `tc_reportes` */

DROP TABLE IF EXISTS `tc_reportes`;

CREATE TABLE `tc_reportes` (
  `REPORTES_ID` int(11) NOT NULL auto_increment,
  `DES_REPORTES` varchar(45) default NULL,
  `PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY  (`REPORTES_ID`),
  KEY `fk_TC_REPORTES_TC_PERFIL1` (`PERFIL_ID`),
  CONSTRAINT `fk_TC_REPORTES_TC_PERFIL1` FOREIGN KEY (`PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tc_reportes` */

insert  into `tc_reportes`(`REPORTES_ID`,`DES_REPORTES`,`PERFIL_ID`) values (1,'semanal',1),(2,'informal',2),(3,'informal',3),(4,'parcial',4);

/*Table structure for table `tc_tipo_evaluacion` */

DROP TABLE IF EXISTS `tc_tipo_evaluacion`;

CREATE TABLE `tc_tipo_evaluacion` (
  `TIPO_EVALUACION_ID` int(11) NOT NULL auto_increment,
  `DES_TIPO_EVALUACION` varchar(45) default NULL,
  PRIMARY KEY  (`TIPO_EVALUACION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tc_tipo_evaluacion` */

insert  into `tc_tipo_evaluacion`(`TIPO_EVALUACION_ID`,`DES_TIPO_EVALUACION`) values (1,'FORMATIVA'),(2,'ACUMULATIVA'),(3,'PARCIAL');

/*Table structure for table `tl_menu` */

DROP TABLE IF EXISTS `tl_menu`;

CREATE TABLE `tl_menu` (
  `id_menu` int(11) NOT NULL,
  `menu` varchar(45) default NULL,
  `url` varchar(45) default NULL,
  `img` varchar(45) default NULL,
  `tc_perfil_PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY  (`id_menu`),
  KEY `fk_tl_menu_tc_perfil1` (`tc_perfil_PERFIL_ID`),
  CONSTRAINT `fk_tl_menu_tc_perfil1` FOREIGN KEY (`tc_perfil_PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tl_menu` */

insert  into `tl_menu`(`id_menu`,`menu`,`url`,`img`,`tc_perfil_PERFIL_ID`) values (1,'Competencias','Competencias/Asignar/grupos.jsp','competencias',1),(2,'Reportes','reportes.jsp','reportes',1),(3,'Evaluaciones Formativas','evaluacionesf.jsp','formativas',1),(4,'Evaluaciones Acumulativa','evaluacionesa.jsp','acumulativas',1),(5,'Estrategias','estrategias/','estrategias',1),(6,'Auto-Evaluacion','competencias.jsp','autoevaluacion',2),(7,'Evaluaciones Formaticas','evaluaciones.jsp','formativas',2),(8,'Competencias','competencias.jsp','competencias',3),(9,'Revisiones','revisiones.jsp','revisiones',3),(10,'Criterios','criterios.jsp','criterios',3),(11,'Reportes','reportes.jsp','reportes',3),(12,'Estrategias','evaluaciones.jsp','estrategias',3),(13,'Competencias','competencias.jsp','competencias',4),(14,'Criterios','criterios.jsp','criterios',4),(15,'Reportes','reportes.jsp','reportes',4),(16,'Estrategias','evaluaciones.jsp','estrategias',4);

/*Table structure for table `tr_alumnos` */

DROP TABLE IF EXISTS `tr_alumnos`;

CREATE TABLE `tr_alumnos` (
  `ALUMNOS_ID` int(11) NOT NULL auto_increment,
  `MATRICULA` varchar(45) default NULL,
  `USUARIO_ID` int(11) NOT NULL,
  `CARRERA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`ALUMNOS_ID`),
  KEY `fk_TC_ALUMNOS_TC_USUARIO1` (`USUARIO_ID`),
  KEY `fk_TR_ALUMNOS_TC_CARRERA1` (`CARRERA_ID`),
  CONSTRAINT `fk_TC_ALUMNOS_TC_USUARIO1` FOREIGN KEY (`USUARIO_ID`) REFERENCES `tr_usuario` (`USUARIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TR_ALUMNOS_TC_CARRERA1` FOREIGN KEY (`CARRERA_ID`) REFERENCES `tc_carrera` (`CARRERA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tr_alumnos` */

insert  into `tr_alumnos`(`ALUMNOS_ID`,`MATRICULA`,`USUARIO_ID`,`CARRERA_ID`) values (1,'up080283',1,1),(2,'up080248',3,1),(3,'up080137',4,1),(4,'up080392',5,1),(5,'up080234',6,1),(6,'up090123',7,1);

/*Table structure for table `tr_criterio_competencia` */

DROP TABLE IF EXISTS `tr_criterio_competencia`;

CREATE TABLE `tr_criterio_competencia` (
  `CRITERIO_COMPETENCIA_ID` int(11) NOT NULL auto_increment,
  `PONDERACION_CRITERIO` varchar(45) default NULL,
  `CRITERIO_ID` int(11) NOT NULL,
  `COMPETENCIA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`CRITERIO_COMPETENCIA_ID`),
  KEY `fk_TR_CRITERIO_COMPETENCIA_TC_CRITERIOS1` (`CRITERIO_ID`),
  KEY `fk_TR_CRITERIO_COMPETENCIA_TC_COMPETENCIAS1` (`COMPETENCIA_ID`),
  CONSTRAINT `fk_TR_CRITERIO_COMPETENCIA_TC_COMPETENCIAS1` FOREIGN KEY (`COMPETENCIA_ID`) REFERENCES `tc_competencias` (`COMPETENCIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TR_CRITERIO_COMPETENCIA_TC_CRITERIOS1` FOREIGN KEY (`CRITERIO_ID`) REFERENCES `tc_criterios` (`CRITERIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tr_criterio_competencia` */

insert  into `tr_criterio_competencia`(`CRITERIO_COMPETENCIA_ID`,`PONDERACION_CRITERIO`,`CRITERIO_ID`,`COMPETENCIA_ID`) values (2,'9',1,1),(3,'10',2,2),(4,'9',3,3),(5,'8',4,4);

/*Table structure for table `tr_est_alumno` */

DROP TABLE IF EXISTS `tr_est_alumno`;

CREATE TABLE `tr_est_alumno` (
  `EST_ALUMNO_ID` int(11) NOT NULL auto_increment,
  `ESTRATEGIA_ID` int(11) NOT NULL,
  `MGMA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`EST_ALUMNO_ID`),
  KEY `fk_EST_ALUMNO_tr_estrategias1` (`ESTRATEGIA_ID`),
  KEY `fk_EST_ALUMNO_tr_materia_maestro_grupo_alumno1` (`MGMA_ID`),
  CONSTRAINT `FK_tr_est_alumno` FOREIGN KEY (`MGMA_ID`) REFERENCES `tr_materia_maestro_grupo_alumno` (`materia_maestro_grupo_alumno_id`),
  CONSTRAINT `FK_tr_est_alumno1` FOREIGN KEY (`ESTRATEGIA_ID`) REFERENCES `tr_estrategias` (`ESTRATEGIA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tr_est_alumno` */

insert  into `tr_est_alumno`(`EST_ALUMNO_ID`,`ESTRATEGIA_ID`,`MGMA_ID`) values (1,5,1),(4,14,6);

/*Table structure for table `tr_estra_mgm` */

DROP TABLE IF EXISTS `tr_estra_mgm`;

CREATE TABLE `tr_estra_mgm` (
  `estra_mgm_id` int(11) NOT NULL auto_increment,
  `ESTRATEGIA_ID` int(11) NOT NULL,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`estra_mgm_id`),
  KEY `fk_estra_mgm_tr_estrategias1` (`ESTRATEGIA_ID`),
  KEY `fk_estra_mgm_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  CONSTRAINT `fk_estra_mgm_tr_estrategias1` FOREIGN KEY (`ESTRATEGIA_ID`) REFERENCES `tr_estrategias` (`ESTRATEGIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_estra_mgm_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tr_estra_mgm` */

insert  into `tr_estra_mgm`(`estra_mgm_id`,`ESTRATEGIA_ID`,`MATERIA_GRUPO_MAESTRO_ID`) values (1,1,1),(2,2,3),(3,3,1),(4,4,2),(5,15,1);

/*Table structure for table `tr_estrategias` */

DROP TABLE IF EXISTS `tr_estrategias`;

CREATE TABLE `tr_estrategias` (
  `ESTRATEGIA_ID` int(11) NOT NULL auto_increment,
  `FECHA_INICIO_REGISTRO` date default NULL,
  `MENSAJE` varchar(45) default NULL,
  `FECHA_CAMBIO` date default NULL,
  PRIMARY KEY  (`ESTRATEGIA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `tr_estrategias` */

insert  into `tr_estrategias`(`ESTRATEGIA_ID`,`FECHA_INICIO_REGISTRO`,`MENSAJE`,`FECHA_CAMBIO`) values (1,'2010-11-14','Un Grupo Excelente','2010-11-14'),(2,'2010-11-14','Grupo masomenos','2010-11-14'),(3,'2010-11-14','Deben leer el libro tipicamente','2010-11-14'),(4,'2010-11-14','Deben hacer  los ejercicios de JAVA','2010-11-14'),(5,'2010-11-14','Desestrezate','2010-11-14'),(14,'2010-11-14','Pride','2010-11-14'),(15,'2010-11-14','Lean el capitulo 5 para reforzar lo aprendido','2010-11-14');

/*Table structure for table `tr_evaluacion_acumulativa` */

DROP TABLE IF EXISTS `tr_evaluacion_acumulativa`;

CREATE TABLE `tr_evaluacion_acumulativa` (
  `EVALUACION_ACUMULATIVA_ID` int(11) NOT NULL auto_increment,
  `PARCIAL` int(11) default NULL,
  `CALIFICACION` int(11) default NULL,
  PRIMARY KEY  (`EVALUACION_ACUMULATIVA_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tr_evaluacion_acumulativa` */

insert  into `tr_evaluacion_acumulativa`(`EVALUACION_ACUMULATIVA_ID`,`PARCIAL`,`CALIFICACION`) values (1,1,9),(2,2,10),(3,3,8),(4,2,7);

/*Table structure for table `tr_evaluacion_parcial` */

DROP TABLE IF EXISTS `tr_evaluacion_parcial`;

CREATE TABLE `tr_evaluacion_parcial` (
  `EVALUACION_PARCIAL_ID` int(11) NOT NULL auto_increment,
  `CALIFICACION` int(11) default NULL,
  `PARCIAL` int(11) default NULL,
  `EVALUACION_NIVEL_ID` int(11) NOT NULL,
  `TIPO_EVALUACION_ID` int(11) NOT NULL,
  `ALUMNOS_ID` int(11) NOT NULL,
  `sesion_id` int(11) NOT NULL,
  PRIMARY KEY  (`EVALUACION_PARCIAL_ID`),
  KEY `fk_tr_evaluacion_parcial_tc_evaluacion_nivel1` (`EVALUACION_NIVEL_ID`),
  KEY `fk_tr_evaluacion_parcial_tc_tipo_evaluacion1` (`TIPO_EVALUACION_ID`),
  KEY `fk_tr_evaluacion_parcial_tr_alumnos1` (`ALUMNOS_ID`),
  KEY `fk_tr_evaluacion_parcial_tr_sesion1` (`sesion_id`),
  CONSTRAINT `fk_tr_evaluacion_parcial_tc_evaluacion_nivel1` FOREIGN KEY (`EVALUACION_NIVEL_ID`) REFERENCES `tc_evaluacion_nivel` (`EVALUACION_NIVEL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_evaluacion_parcial_tc_tipo_evaluacion1` FOREIGN KEY (`TIPO_EVALUACION_ID`) REFERENCES `tc_tipo_evaluacion` (`TIPO_EVALUACION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_evaluacion_parcial_tr_alumnos1` FOREIGN KEY (`ALUMNOS_ID`) REFERENCES `tr_alumnos` (`ALUMNOS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_evaluacion_parcial_tr_sesion1` FOREIGN KEY (`sesion_id`) REFERENCES `tr_sesion` (`sesion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tr_evaluacion_parcial` */

/*Table structure for table `tr_evaluacion_parcial_acumulativa` */

DROP TABLE IF EXISTS `tr_evaluacion_parcial_acumulativa`;

CREATE TABLE `tr_evaluacion_parcial_acumulativa` (
  `EVALUACION_PARCIAL_ACUMULATIVA_ID` int(11) NOT NULL auto_increment,
  `EVALUACION_PARCIAL_ID` int(11) NOT NULL,
  `EVALUACION_ACUMULATIVA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`EVALUACION_PARCIAL_ACUMULATIVA_ID`),
  KEY `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_parcial1` (`EVALUACION_PARCIAL_ID`),
  KEY `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_acumulativa1` (`EVALUACION_ACUMULATIVA_ID`),
  CONSTRAINT `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_acumulativa1` FOREIGN KEY (`EVALUACION_ACUMULATIVA_ID`) REFERENCES `tr_evaluacion_acumulativa` (`EVALUACION_ACUMULATIVA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_parcial1` FOREIGN KEY (`EVALUACION_PARCIAL_ID`) REFERENCES `tr_evaluacion_parcial` (`EVALUACION_PARCIAL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tr_evaluacion_parcial_acumulativa` */

/*Table structure for table `tr_grupo_alumno` */

DROP TABLE IF EXISTS `tr_grupo_alumno`;

CREATE TABLE `tr_grupo_alumno` (
  `GRUPO_ALUMNO_ID` int(11) NOT NULL auto_increment,
  `GRUPO_ID` int(11) NOT NULL,
  `ALUMNOS_ID` int(11) NOT NULL,
  PRIMARY KEY  (`GRUPO_ALUMNO_ID`),
  KEY `fk_tr_grupo_alumno_tc_grupo1` (`GRUPO_ID`),
  KEY `fk_tr_grupo_alumno_tr_alumnos1` (`ALUMNOS_ID`),
  CONSTRAINT `fk_tr_grupo_alumno_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_grupo_alumno_tr_alumnos1` FOREIGN KEY (`ALUMNOS_ID`) REFERENCES `tr_alumnos` (`ALUMNOS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tr_grupo_alumno` */

insert  into `tr_grupo_alumno`(`GRUPO_ALUMNO_ID`,`GRUPO_ID`,`ALUMNOS_ID`) values (1,4,2),(2,4,3),(3,4,4),(4,4,5),(5,5,1),(6,7,6);

/*Table structure for table `tr_grupo_carrera` */

DROP TABLE IF EXISTS `tr_grupo_carrera`;

CREATE TABLE `tr_grupo_carrera` (
  `GRUPO_CARRERA_ID` int(11) NOT NULL auto_increment,
  `CARRERA_ID` int(11) NOT NULL,
  `GRUPO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`GRUPO_CARRERA_ID`),
  KEY `fk_TR_GRUPO_CARRERA_tc_carrera` (`CARRERA_ID`),
  KEY `fk_TR_GRUPO_CARRERA_tc_grupo1` (`GRUPO_ID`),
  CONSTRAINT `fk_TR_GRUPO_CARRERA_tc_carrera` FOREIGN KEY (`CARRERA_ID`) REFERENCES `tc_carrera` (`CARRERA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TR_GRUPO_CARRERA_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tr_grupo_carrera` */

/*Table structure for table `tr_maestro_grupo_materia` */

DROP TABLE IF EXISTS `tr_maestro_grupo_materia`;

CREATE TABLE `tr_maestro_grupo_materia` (
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL auto_increment,
  `GRUPO_ID` int(11) NOT NULL,
  `MATERIAS_ID` int(11) NOT NULL,
  `MAESTRO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_materia_grupo_materia_tc_grupo1` (`GRUPO_ID`),
  KEY `fk_tr_materia_grupo_materia_tc_materias1` (`MATERIAS_ID`),
  KEY `fk_tr_materia_grupo_materia_tr_maestros1` (`MAESTRO_ID`),
  CONSTRAINT `fk_tr_materia_grupo_materia_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_materia_grupo_materia_tc_materias1` FOREIGN KEY (`MATERIAS_ID`) REFERENCES `tc_materias` (`MATERIAS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_materia_grupo_materia_tr_maestros1` FOREIGN KEY (`MAESTRO_ID`) REFERENCES `tr_maestros` (`MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tr_maestro_grupo_materia` */

insert  into `tr_maestro_grupo_materia`(`MATERIA_GRUPO_MAESTRO_ID`,`GRUPO_ID`,`MATERIAS_ID`,`MAESTRO_ID`) values (1,4,4,1),(2,7,1,1),(3,5,4,1);

/*Table structure for table `tr_maestros` */

DROP TABLE IF EXISTS `tr_maestros`;

CREATE TABLE `tr_maestros` (
  `MAESTRO_ID` int(11) NOT NULL auto_increment,
  `CODIGO` varchar(45) default NULL,
  `USUARIO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`MAESTRO_ID`),
  KEY `fk_tr_maestros_tr_usuario1` (`USUARIO_ID`),
  CONSTRAINT `fk_tr_maestros_tr_usuario1` FOREIGN KEY (`USUARIO_ID`) REFERENCES `tr_usuario` (`USUARIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `tr_maestros` */

insert  into `tr_maestros`(`MAESTRO_ID`,`CODIGO`,`USUARIO_ID`) values (1,'ma131221',2);

/*Table structure for table `tr_materia_maestro_grupo_alumno` */

DROP TABLE IF EXISTS `tr_materia_maestro_grupo_alumno`;

CREATE TABLE `tr_materia_maestro_grupo_alumno` (
  `materia_maestro_grupo_alumno_id` int(11) NOT NULL auto_increment,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `tr_grupo_alumno_GRUPO_ALUMNO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`materia_maestro_grupo_alumno_id`),
  KEY `fk_tr_materia_maestro_grupo_alumno_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_materia_maestro_grupo_alumno_tr_grupo_alumno1` (`tr_grupo_alumno_GRUPO_ALUMNO_ID`),
  CONSTRAINT `fk_tr_materia_maestro_grupo_alumno_tr_grupo_alumno1` FOREIGN KEY (`tr_grupo_alumno_GRUPO_ALUMNO_ID`) REFERENCES `tr_grupo_alumno` (`GRUPO_ALUMNO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_materia_maestro_grupo_alumno_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tr_materia_maestro_grupo_alumno` */

insert  into `tr_materia_maestro_grupo_alumno`(`materia_maestro_grupo_alumno_id`,`MATERIA_GRUPO_MAESTRO_ID`,`tr_grupo_alumno_GRUPO_ALUMNO_ID`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,3,5),(6,2,6);

/*Table structure for table `tr_presesion` */

DROP TABLE IF EXISTS `tr_presesion`;

CREATE TABLE `tr_presesion` (
  `PRESESION_ID` int(11) NOT NULL auto_increment,
  `MENSAJE` varchar(255) default NULL,
  `ESTADO` int(11) default NULL,
  `PONDERACION` varchar(45) default NULL,
  `CRITERIO_COMPETENCIA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`PRESESION_ID`),
  KEY `fk_tr_presesion_tr_criterio_competencia1` (`CRITERIO_COMPETENCIA_ID`),
  CONSTRAINT `fk_tr_presesion_tr_criterio_competencia1` FOREIGN KEY (`CRITERIO_COMPETENCIA_ID`) REFERENCES `tr_criterio_competencia` (`CRITERIO_COMPETENCIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `tr_presesion` */

insert  into `tr_presesion`(`PRESESION_ID`,`MENSAJE`,`ESTADO`,`PONDERACION`,`CRITERIO_COMPETENCIA_ID`) values (6,'Mensaje de la presesion 1',0,'80',2),(7,'Mensaje de la presesion 2 ',1,'70',3),(8,'Mensaje de la presesion 3',1,'60',4),(9,'Mensaje de la presesion 4',0,'50',5);

/*Table structure for table `tr_presesion_rechazada` */

DROP TABLE IF EXISTS `tr_presesion_rechazada`;

CREATE TABLE `tr_presesion_rechazada` (
  `SESION_RECHAZADA_ID` int(11) NOT NULL auto_increment,
  `MENSAJE` varchar(45) default NULL,
  `PRESESION_ID` int(11) NOT NULL,
  PRIMARY KEY  (`SESION_RECHAZADA_ID`),
  KEY `fk_tr_presesion_rechazada_tr_presesion1` (`PRESESION_ID`),
  CONSTRAINT `fk_tr_presesion_rechazada_tr_presesion1` FOREIGN KEY (`PRESESION_ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `tr_presesion_rechazada` */

insert  into `tr_presesion_rechazada`(`SESION_RECHAZADA_ID`,`MENSAJE`,`PRESESION_ID`) values (5,'Fallida por falta de criterios',6);

/*Table structure for table `tr_sesion` */

DROP TABLE IF EXISTS `tr_sesion`;

CREATE TABLE `tr_sesion` (
  `sesion_id` int(11) NOT NULL auto_increment,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `PRESESION_ID` int(11) NOT NULL,
  `ESTADO` tinyint(1) default NULL,
  PRIMARY KEY  (`sesion_id`),
  KEY `fk_tr_sesion_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_sesion_tr_presesion1` (`PRESESION_ID`),
  CONSTRAINT `fk_tr_sesion_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tr_sesion_tr_presesion1` FOREIGN KEY (`PRESESION_ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tr_sesion` */

/*Table structure for table `tr_usuario` */

DROP TABLE IF EXISTS `tr_usuario`;

CREATE TABLE `tr_usuario` (
  `USUARIO_ID` int(11) NOT NULL auto_increment,
  `NOMBRES` varchar(45) default NULL,
  `APELLIDO_PATERNO` varchar(45) default NULL,
  `APELLIDO_MATERNO` varchar(45) default NULL,
  `FECHA_NAC` varchar(10) default NULL,
  `USUARIO` varchar(45) default NULL,
  `PASSWORD` varchar(45) default NULL,
  `IMAGEN` varchar(45) default NULL,
  `PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY  (`USUARIO_ID`),
  KEY `fk_tr_usuario_tc_perfil1` (`PERFIL_ID`),
  CONSTRAINT `fk_tr_usuario_tc_perfil1` FOREIGN KEY (`PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `tr_usuario` */

insert  into `tr_usuario`(`USUARIO_ID`,`NOMBRES`,`APELLIDO_PATERNO`,`APELLIDO_MATERNO`,`FECHA_NAC`,`USUARIO`,`PASSWORD`,`IMAGEN`,`PERFIL_ID`) values (1,'Esteban Alberto','Uscanga','Olea','10/10/10','darknavi','darknavi','dsadsa.jpg',2),(2,'Omar ','Rosales','Hernandez','10/10/1950','omar','omar','dasvas.jpg',1),(3,'Amanda Janeth ','Gonzalez','Macias','29/08/1990','haru','haru','haruhi.jpg',2),(4,'Oscar David','Díaz ','Avalos','16/07/1990','zero','zero','Fuminori.jpg',2),(5,'Luis Giovanni','Ramirez','Franco','10/10/1990','monin','monin','mello.png',2),(6,'Giannina Wendolyne','Cajero','Rodriguez','22/09/1989','wen','wen','moka2.jpg',2),(7,'Leonel','Kirby','Kirbioso','0/0/0','kirbi','kirbi','1284708944271.jpg',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
