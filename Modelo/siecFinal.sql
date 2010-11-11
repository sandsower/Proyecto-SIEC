-- phpMyAdmin SQL Dump
-- version 3.3.7deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 09, 2010 at 04:50 PM
-- Server version: 5.1.49
-- PHP Version: 5.3.3-1ubuntu9.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `siec`
--

-- --------------------------------------------------------

--
-- Table structure for table `tc_carrera`
--

CREATE TABLE IF NOT EXISTS `tc_carrera` (
  `CARRERA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_CARRERA` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CARRERA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `tc_carrera`
--

INSERT INTO `tc_carrera` (`CARRERA_ID`, `DES_CARRERA`) VALUES
(1, 'ISEI'),
(2, 'MECATRONICA'),
(3, 'ELECTRONICA'),
(4, 'ENERGIAS'),
(5, 'LANI'),
(6, 'INDUSTRIAL'),
(7, 'MECANICA');

-- --------------------------------------------------------

--
-- Table structure for table `tc_categorias`
--

CREATE TABLE IF NOT EXISTS `tc_categorias` (
  `CATEGORIA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_CATEGORIA` varchar(45) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `ORDEN` int(11) DEFAULT NULL,
  PRIMARY KEY (`CATEGORIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `tc_categorias`
--

INSERT INTO `tc_categorias` (`CATEGORIA_ID`, `DES_CATEGORIA`, `DESCRIPCION`, `ORDEN`) VALUES
(1, 'TEORIA', 'SE EVALUA LA PARTE TEORICA', 1),
(2, 'PRACTICA', 'SE EVALUA LA APLICACION DE LA TEORIA', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tc_competencias`
--

CREATE TABLE IF NOT EXISTS `tc_competencias` (
  `COMPETENCIA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_COMPETENCIA` varchar(45) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `CATEGORIA_ID` int(11) NOT NULL,
  PRIMARY KEY (`COMPETENCIA_ID`),
  KEY `fk_TC_COMPETENCIAS_CATEGORIAS` (`CATEGORIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tc_competencias`
--

INSERT INTO `tc_competencias` (`COMPETENCIA_ID`, `DES_COMPETENCIA`, `DESCRIPCION`, `CATEGORIA_ID`) VALUES
(1, 'PROGRAMACIO ESTRUCTURADA', 'EL ALUMNO APRENDERA A REALIZAR CODIGOS CON UNA ESTRUCTURA ORDENADA Y LIMPIA TAMBIEN', 2),
(2, 'MANEJO DE CISCO', 'EL ALIMNO APRENDERA A REALIZAR REDES EN LA HERRAMIENTA CISCO ', 2),
(3, 'APRENDER ESTRATEGIAS DE DOCUMENTACION', 'EL ALUMNO APRENDERA A REALIZAR LA DOCUMENTACION NECESARIA PARA EL DESARROLLO DEL SOFTWARE', 1),
(4, 'SOLUCION DE ECUACIONES', 'EL ALUMNO APRENDERA A RESOLVER ECUACIONES MEDIANTE DIFERENTES TIPOS DE SOLUCION', 2),
(5, 'ABC', 'Nueva competencia', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tc_criterios`
--

CREATE TABLE IF NOT EXISTS `tc_criterios` (
  `CRITERIO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_CRITERIO` varchar(50) DEFAULT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `Ponderacion` int(11) NOT NULL,
  PRIMARY KEY (`CRITERIO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tc_criterios`
--

INSERT INTO `tc_criterios` (`CRITERIO_ID`, `DES_CRITERIO`, `DESCRIPCION`, `Ponderacion`) VALUES
(1, 'REALIZAR METODS', 'EL ALUMNO APRENDERA A REALIZAR METODOS QUE PERMITAN COMPRENDER MAS UNCODIGO', 0),
(2, 'CREACION DE CLASES', 'EL ALUMNO APRENDERA A REALIZAR CLASESY METODOS BASICOS PARA EL DESARROLLO DE SOFTWARE', 0),
(3, 'PUNTUALIDAD', 'REALIZAR EN TIEMPO Y FORMA LAS ACTIVIDADES DE LA MATERIA', 0),
(4, 'REALIZAR VLANS', 'EL ALUMNO APRENDERA EL CONCEPTO Y ELABORACION DE VLANS', 0),
(5, 'ABC', 'Nuevo criterio', 12);

-- --------------------------------------------------------

--
-- Table structure for table `tc_departamentos`
--

CREATE TABLE IF NOT EXISTS `tc_departamentos` (
  `DEPARTAMENTO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_DEPARTAMENTO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DEPARTAMENTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tc_departamentos`
--

INSERT INTO `tc_departamentos` (`DEPARTAMENTO_ID`, `DES_DEPARTAMENTO`) VALUES
(1, 'MATEMATICAS'),
(2, 'IDIOMAS'),
(3, 'ISEI');

-- --------------------------------------------------------

--
-- Table structure for table `tc_evaluacion_nivel`
--

CREATE TABLE IF NOT EXISTS `tc_evaluacion_nivel` (
  `EVALUACION_NIVEL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_EVALUACION` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`EVALUACION_NIVEL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tc_evaluacion_nivel`
--

INSERT INTO `tc_evaluacion_nivel` (`EVALUACION_NIVEL_ID`, `DES_EVALUACION`) VALUES
(1, 'COMPETENTE'),
(2, 'BASICO'),
(3, 'INDEPENDIENTE'),
(4, 'AVANZADO'),
(5, 'INCOMPETENTE');

-- --------------------------------------------------------

--
-- Table structure for table `tc_grupo`
--

CREATE TABLE IF NOT EXISTS `tc_grupo` (
  `GRUPO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_GRUPO` varchar(45) DEFAULT NULL,
  `CARRERA_ID` int(11) NOT NULL,
  `GRADO` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`GRUPO_ID`),
  KEY `fk_TC_GRUPO_TC_CARRERA1` (`CARRERA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `tc_grupo`
--

INSERT INTO `tc_grupo` (`GRUPO_ID`, `DES_GRUPO`, `CARRERA_ID`, `GRADO`) VALUES
(4, '6', 1, 'A'),
(5, '6', 1, 'A'),
(6, '4', 2, 'B'),
(7, '3', 6, '3');

-- --------------------------------------------------------

--
-- Table structure for table `tc_materias`
--

CREATE TABLE IF NOT EXISTS `tc_materias` (
  `MATERIAS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_MATERIAS` varchar(45) DEFAULT NULL,
  `DEPARTAMENTO_ID` int(11) NOT NULL,
  PRIMARY KEY (`MATERIAS_ID`),
  KEY `fk_tc_materias_tc_departamentos1` (`DEPARTAMENTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tc_materias`
--

INSERT INTO `tc_materias` (`MATERIAS_ID`, `DES_MATERIAS`, `DEPARTAMENTO_ID`) VALUES
(1, 'PROGRAMACION II', 3),
(2, 'CALCULO INTEGRAL', 1),
(3, 'INGLES VI', 2);

-- --------------------------------------------------------

--
-- Table structure for table `tc_perfil`
--

CREATE TABLE IF NOT EXISTS `tc_perfil` (
  `PERFIL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_PERFIL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PERFIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tc_perfil`
--

INSERT INTO `tc_perfil` (`PERFIL_ID`, `DES_PERFIL`) VALUES
(1, 'alumno'),
(2, 'maestro'),
(3, 'tutor'),
(4, 'DPA'),
(5, 'jefe de carrera');

-- --------------------------------------------------------

--
-- Table structure for table `tc_reportes`
--

CREATE TABLE IF NOT EXISTS `tc_reportes` (
  `REPORTES_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_REPORTES` varchar(45) DEFAULT NULL,
  `PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY (`REPORTES_ID`),
  KEY `fk_TC_REPORTES_TC_PERFIL1` (`PERFIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `tc_reportes`
--

INSERT INTO `tc_reportes` (`REPORTES_ID`, `DES_REPORTES`, `PERFIL_ID`) VALUES
(1, 'semanal', 1),
(2, 'informal', 2),
(3, 'informal', 3),
(4, 'parcial', 4);

-- --------------------------------------------------------

--
-- Table structure for table `tc_tipo_evaluacion`
--

CREATE TABLE IF NOT EXISTS `tc_tipo_evaluacion` (
  `TIPO_EVALUACION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DES_TIPO_EVALUACION` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TIPO_EVALUACION_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tc_tipo_evaluacion`
--

INSERT INTO `tc_tipo_evaluacion` (`TIPO_EVALUACION_ID`, `DES_TIPO_EVALUACION`) VALUES
(1, 'FORMATIVA'),
(2, 'ACUMULATIVA'),
(3, 'PARCIAL');

-- --------------------------------------------------------

--
-- Table structure for table `tr_alumnos`
--

CREATE TABLE IF NOT EXISTS `tr_alumnos` (
  `ALUMNOS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MATRICULA` varchar(45) DEFAULT NULL,
  `USUARIO_ID` int(11) NOT NULL,
  `CARRERA_ID` int(11) NOT NULL,
  PRIMARY KEY (`ALUMNOS_ID`),
  KEY `fk_TC_ALUMNOS_TC_USUARIO1` (`USUARIO_ID`),
  KEY `fk_TR_ALUMNOS_TC_CARRERA1` (`CARRERA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `tr_alumnos`
--

INSERT INTO `tr_alumnos` (`ALUMNOS_ID`, `MATRICULA`, `USUARIO_ID`, `CARRERA_ID`) VALUES
(11, 'up080394', 7, 1),
(12, 'up080293', 8, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tr_criterio_competencia`
--

CREATE TABLE IF NOT EXISTS `tr_criterio_competencia` (
  `CRITERIO_COMPETENCIA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PONDERACION_CRITERIO` varchar(45) DEFAULT NULL,
  `CRITERIO_ID` int(11) NOT NULL,
  `COMPETENCIA_ID` int(11) NOT NULL,
  PRIMARY KEY (`CRITERIO_COMPETENCIA_ID`),
  KEY `fk_TR_CRITERIO_COMPETENCIA_TC_CRITERIOS1` (`CRITERIO_ID`),
  KEY `fk_TR_CRITERIO_COMPETENCIA_TC_COMPETENCIAS1` (`COMPETENCIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `tr_criterio_competencia`
--

INSERT INTO `tr_criterio_competencia` (`CRITERIO_COMPETENCIA_ID`, `PONDERACION_CRITERIO`, `CRITERIO_ID`, `COMPETENCIA_ID`) VALUES
(2, '9', 1, 1),
(3, '10', 2, 2),
(4, '9', 3, 3),
(5, '8', 4, 4),
(6, NULL, 5, 5),
(7, NULL, 4, 5),
(8, NULL, 1, 5);

-- --------------------------------------------------------

--
-- Table structure for table `tr_estrategias`
--

CREATE TABLE IF NOT EXISTS `tr_estrategias` (
  `ESTRATEGIA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FECHA_INICIO_REGISTRO` varchar(10) DEFAULT NULL,
  `MENSAJE` varchar(45) DEFAULT NULL,
  `FECHA_CAMBIO` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ESTRATEGIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `tr_estrategias`
--

INSERT INTO `tr_estrategias` (`ESTRATEGIA_ID`, `FECHA_INICIO_REGISTRO`, `MENSAJE`, `FECHA_CAMBIO`) VALUES
(16, '10-01-2010', 'Estudiar mas', '10-02-2010');

-- --------------------------------------------------------

--
-- Table structure for table `tr_estra_mgm`
--

CREATE TABLE IF NOT EXISTS `tr_estra_mgm` (
  `estra_mgm_id` int(11) NOT NULL AUTO_INCREMENT,
  `ESTRATEGIA_ID` int(11) NOT NULL,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `mgma_id` int(11) NOT NULL,
  PRIMARY KEY (`estra_mgm_id`),
  KEY `fk_estra_mgm_tr_estrategias1` (`ESTRATEGIA_ID`),
  KEY `fk_estra_mgm_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_estra_mgm_tr_materia_maestro_grupo_alumno1` (`mgma_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `tr_estra_mgm`
--


-- --------------------------------------------------------

--
-- Table structure for table `tr_est_alumno`
--

CREATE TABLE IF NOT EXISTS `tr_est_alumno` (
  `EST_ALUMNO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ESTRATEGIA_ID` int(11) NOT NULL,
  `MGMA_ID` int(11) NOT NULL,
  PRIMARY KEY (`EST_ALUMNO_ID`),
  KEY `fk_EST_ALUMNO_tr_estrategias1` (`ESTRATEGIA_ID`),
  KEY `fk_EST_ALUMNO_tr_materia_maestro_grupo_alumno1` (`MGMA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `tr_est_alumno`
--


-- --------------------------------------------------------

--
-- Table structure for table `tr_evaluacion_acumulativa`
--

CREATE TABLE IF NOT EXISTS `tr_evaluacion_acumulativa` (
  `EVALUACION_ACUMULATIVA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PARCIAL` int(11) DEFAULT NULL,
  `CALIFICACION` int(11) DEFAULT NULL,
  PRIMARY KEY (`EVALUACION_ACUMULATIVA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `tr_evaluacion_acumulativa`
--

INSERT INTO `tr_evaluacion_acumulativa` (`EVALUACION_ACUMULATIVA_ID`, `PARCIAL`, `CALIFICACION`) VALUES
(1, 1, 9),
(2, 2, 10),
(3, 3, 8),
(4, 2, 7);

-- --------------------------------------------------------

--
-- Table structure for table `tr_evaluacion_parcial`
--

CREATE TABLE IF NOT EXISTS `tr_evaluacion_parcial` (
  `EVALUACION_PARCIAL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CALIFICACION` int(11) DEFAULT NULL,
  `PARCIAL` int(11) DEFAULT NULL,
  `EVALUACION_NIVEL_ID` int(11) NOT NULL,
  `TIPO_EVALUACION_ID` int(11) NOT NULL,
  `ALUMNOS_ID` int(11) NOT NULL,
  `sesion_id` int(11) NOT NULL,
  PRIMARY KEY (`EVALUACION_PARCIAL_ID`),
  KEY `fk_tr_evaluacion_parcial_tc_evaluacion_nivel1` (`EVALUACION_NIVEL_ID`),
  KEY `fk_tr_evaluacion_parcial_tc_tipo_evaluacion1` (`TIPO_EVALUACION_ID`),
  KEY `fk_tr_evaluacion_parcial_tr_alumnos1` (`ALUMNOS_ID`),
  KEY `fk_tr_evaluacion_parcial_tr_sesion1` (`sesion_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `tr_evaluacion_parcial`
--

INSERT INTO `tr_evaluacion_parcial` (`EVALUACION_PARCIAL_ID`, `CALIFICACION`, `PARCIAL`, `EVALUACION_NIVEL_ID`, `TIPO_EVALUACION_ID`, `ALUMNOS_ID`, `sesion_id`) VALUES
(12, 0, 1, 2, 1, 11, 5),
(20, 0, 1, 3, 2, 12, 5),
(21, 0, 1, 4, 3, 11, 5),
(22, 0, 1, 4, 3, 12, 5);

-- --------------------------------------------------------

--
-- Table structure for table `tr_evaluacion_parcial_acumulativa`
--

CREATE TABLE IF NOT EXISTS `tr_evaluacion_parcial_acumulativa` (
  `EVALUACION_PARCIAL_ACUMULATIVA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EVALUACION_PARCIAL_ID` int(11) NOT NULL,
  `EVALUACION_ACUMULATIVA_ID` int(11) NOT NULL,
  PRIMARY KEY (`EVALUACION_PARCIAL_ACUMULATIVA_ID`),
  KEY `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_parcial1` (`EVALUACION_PARCIAL_ID`),
  KEY `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_acumulativa1` (`EVALUACION_ACUMULATIVA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `tr_evaluacion_parcial_acumulativa`
--

INSERT INTO `tr_evaluacion_parcial_acumulativa` (`EVALUACION_PARCIAL_ACUMULATIVA_ID`, `EVALUACION_PARCIAL_ID`, `EVALUACION_ACUMULATIVA_ID`) VALUES
(14, 12, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tr_grupo_alumno`
--

CREATE TABLE IF NOT EXISTS `tr_grupo_alumno` (
  `GRUPO_ALUMNO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `GRUPO_ID` int(11) NOT NULL,
  `ALUMNOS_ID` int(11) NOT NULL,
  PRIMARY KEY (`GRUPO_ALUMNO_ID`),
  KEY `fk_tr_grupo_alumno_tc_grupo1` (`GRUPO_ID`),
  KEY `fk_tr_grupo_alumno_tr_alumnos1` (`ALUMNOS_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tr_grupo_alumno`
--

INSERT INTO `tr_grupo_alumno` (`GRUPO_ALUMNO_ID`, `GRUPO_ID`, `ALUMNOS_ID`) VALUES
(2, 4, 11),
(3, 4, 12);

-- --------------------------------------------------------

--
-- Table structure for table `tr_grupo_carrera`
--

CREATE TABLE IF NOT EXISTS `tr_grupo_carrera` (
  `GRUPO_CARRERA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CARRERA_ID` int(11) NOT NULL,
  `GRUPO_ID` int(11) NOT NULL,
  PRIMARY KEY (`GRUPO_CARRERA_ID`),
  KEY `fk_TR_GRUPO_CARRERA_tc_carrera` (`CARRERA_ID`),
  KEY `fk_TR_GRUPO_CARRERA_tc_grupo1` (`GRUPO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `tr_grupo_carrera`
--

INSERT INTO `tr_grupo_carrera` (`GRUPO_CARRERA_ID`, `CARRERA_ID`, `GRUPO_ID`) VALUES
(1, 1, 4),
(2, 2, 5),
(3, 3, 5),
(4, 6, 6),
(5, 4, 5),
(6, 5, 7),
(7, 1, 4);

-- --------------------------------------------------------

--
-- Table structure for table `tr_maestros`
--

CREATE TABLE IF NOT EXISTS `tr_maestros` (
  `MAESTRO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CODIGO` varchar(45) DEFAULT NULL,
  `USUARIO_ID` int(11) NOT NULL,
  PRIMARY KEY (`MAESTRO_ID`),
  KEY `fk_tr_maestros_tr_usuario1` (`USUARIO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `tr_maestros`
--

INSERT INTO `tr_maestros` (`MAESTRO_ID`, `CODIGO`, `USUARIO_ID`) VALUES
(6, 'adsjkh', 9);

-- --------------------------------------------------------

--
-- Table structure for table `tr_maestro_grupo_materia`
--

CREATE TABLE IF NOT EXISTS `tr_maestro_grupo_materia` (
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `GRUPO_ID` int(11) NOT NULL,
  `MATERIAS_ID` int(11) NOT NULL,
  `MAESTRO_ID` int(11) NOT NULL,
  PRIMARY KEY (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_materia_grupo_materia_tc_grupo1` (`GRUPO_ID`),
  KEY `fk_tr_materia_grupo_materia_tc_materias1` (`MATERIAS_ID`),
  KEY `fk_tr_materia_grupo_materia_tr_maestros1` (`MAESTRO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `tr_maestro_grupo_materia`
--

INSERT INTO `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`, `GRUPO_ID`, `MATERIAS_ID`, `MAESTRO_ID`) VALUES
(9, 4, 1, 6);

-- --------------------------------------------------------

--
-- Table structure for table `tr_materia_maestro_grupo_alumno`
--

CREATE TABLE IF NOT EXISTS `tr_materia_maestro_grupo_alumno` (
  `materia_maestro_grupo_alumno_id` int(11) NOT NULL AUTO_INCREMENT,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `tr_grupo_alumno_GRUPO_ALUMNO_ID` int(11) NOT NULL,
  PRIMARY KEY (`materia_maestro_grupo_alumno_id`),
  KEY `fk_tr_materia_maestro_grupo_alumno_tr_grupo_alumno1` (`tr_grupo_alumno_GRUPO_ALUMNO_ID`),
  KEY `fk_tr_materia_maestro_grupo_alumno_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `tr_materia_maestro_grupo_alumno`
--


-- --------------------------------------------------------

--
-- Table structure for table `tr_presesion`
--

CREATE TABLE IF NOT EXISTS `tr_presesion` (
  `PRESESION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MENSAJE` varchar(255) DEFAULT NULL,
  `ESTADO` int(11) DEFAULT NULL,
  `PONDERACION` varchar(45) DEFAULT NULL,
  `CRITERIO_COMPETENCIA_ID` int(11) NOT NULL,
  PRIMARY KEY (`PRESESION_ID`),
  KEY `fk_tr_presesion_tr_criterio_competencia1` (`CRITERIO_COMPETENCIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `tr_presesion`
--

INSERT INTO `tr_presesion` (`PRESESION_ID`, `MENSAJE`, `ESTADO`, `PONDERACION`, `CRITERIO_COMPETENCIA_ID`) VALUES
(6, 'Mensaje de la presesion 1', 0, '80', 2),
(7, 'Mensaje de la presesion 2 ', 1, '70', 3),
(8, 'Mensaje de la presesion 3', 1, '60', 4),
(9, 'Mensaje de la presesion 4', 0, '50', 5);

-- --------------------------------------------------------

--
-- Table structure for table `tr_presesion_rechazada`
--

CREATE TABLE IF NOT EXISTS `tr_presesion_rechazada` (
  `SESION_RECHAZADA_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MENSAJE` varchar(45) DEFAULT NULL,
  `PRESESION_ID` int(11) NOT NULL,
  PRIMARY KEY (`SESION_RECHAZADA_ID`),
  KEY `fk_tr_presesion_rechazada_tr_presesion1` (`PRESESION_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tr_presesion_rechazada`
--

INSERT INTO `tr_presesion_rechazada` (`SESION_RECHAZADA_ID`, `MENSAJE`, `PRESESION_ID`) VALUES
(5, 'Fallida por falta de criterios', 6);

-- --------------------------------------------------------

--
-- Table structure for table `tr_sesion`
--

CREATE TABLE IF NOT EXISTS `tr_sesion` (
  `sesion_id` int(11) NOT NULL AUTO_INCREMENT,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `PRESESION_ID` int(11) NOT NULL,
  `ESTADO` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`sesion_id`),
  KEY `fk_tr_sesion_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_sesion_tr_presesion1` (`PRESESION_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tr_sesion`
--

INSERT INTO `tr_sesion` (`sesion_id`, `MATERIA_GRUPO_MAESTRO_ID`, `PRESESION_ID`, `ESTADO`) VALUES
(5, 9, 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tr_usuario`
--

CREATE TABLE IF NOT EXISTS `tr_usuario` (
  `USUARIO_ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRES` varchar(45) DEFAULT NULL,
  `APELLIDO_PATERNO` varchar(45) DEFAULT NULL,
  `APELLIDO_MATERNO` varchar(45) DEFAULT NULL,
  `FECHA_NAC` varchar(10) DEFAULT NULL,
  `USUARIO` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  `IMAGEN` varchar(45) DEFAULT NULL,
  `PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY (`USUARIO_ID`),
  KEY `fk_tr_usuario_tc_perfil1` (`PERFIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `tr_usuario`
--

INSERT INTO `tr_usuario` (`USUARIO_ID`, `NOMBRES`, `APELLIDO_PATERNO`, `APELLIDO_MATERNO`, `FECHA_NAC`, `USUARIO`, `PASSWORD`, `IMAGEN`, `PERFIL_ID`) VALUES
(7, 'carlos', 'bolanos', 'lopez', '2010-10-10', 'garrison', 'gameover', 'asd', 1),
(8, 'victor', 'valenzuela', 'martinez', '2001-01-02', 'sanders', 'sands', 'asd', 2),
(9, 'Maria', 'Teran', 'algo', '2003-04-02', 'rteran', 'r', 'asd', 3);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tc_competencias`
--
ALTER TABLE `tc_competencias`
  ADD CONSTRAINT `fk_TC_COMPETENCIAS_CATEGORIAS` FOREIGN KEY (`CATEGORIA_ID`) REFERENCES `tc_categorias` (`CATEGORIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tc_materias`
--
ALTER TABLE `tc_materias`
  ADD CONSTRAINT `fk_tc_materias_tc_departamentos1` FOREIGN KEY (`DEPARTAMENTO_ID`) REFERENCES `tc_departamentos` (`DEPARTAMENTO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tc_reportes`
--
ALTER TABLE `tc_reportes`
  ADD CONSTRAINT `fk_TC_REPORTES_TC_PERFIL1` FOREIGN KEY (`PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_alumnos`
--
ALTER TABLE `tr_alumnos`
  ADD CONSTRAINT `fk_TC_ALUMNOS_TC_USUARIO1` FOREIGN KEY (`USUARIO_ID`) REFERENCES `tr_usuario` (`USUARIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TR_ALUMNOS_TC_CARRERA1` FOREIGN KEY (`CARRERA_ID`) REFERENCES `tc_carrera` (`CARRERA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_criterio_competencia`
--
ALTER TABLE `tr_criterio_competencia`
  ADD CONSTRAINT `fk_TR_CRITERIO_COMPETENCIA_TC_COMPETENCIAS1` FOREIGN KEY (`COMPETENCIA_ID`) REFERENCES `tc_competencias` (`COMPETENCIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TR_CRITERIO_COMPETENCIA_TC_CRITERIOS1` FOREIGN KEY (`CRITERIO_ID`) REFERENCES `tc_criterios` (`CRITERIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_estra_mgm`
--
ALTER TABLE `tr_estra_mgm`
  ADD CONSTRAINT `fk_estra_mgm_tr_estrategias1` FOREIGN KEY (`ESTRATEGIA_ID`) REFERENCES `tr_estrategias` (`ESTRATEGIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_estra_mgm_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_estra_mgm_tr_materia_maestro_grupo_alumno1` FOREIGN KEY (`mgma_id`) REFERENCES `tr_materia_maestro_grupo_alumno` (`materia_maestro_grupo_alumno_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_est_alumno`
--
ALTER TABLE `tr_est_alumno`
  ADD CONSTRAINT `fk_EST_ALUMNO_tr_estrategias1` FOREIGN KEY (`ESTRATEGIA_ID`) REFERENCES `tr_estrategias` (`ESTRATEGIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_evaluacion_parcial`
--
ALTER TABLE `tr_evaluacion_parcial`
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tc_evaluacion_nivel1` FOREIGN KEY (`EVALUACION_NIVEL_ID`) REFERENCES `tc_evaluacion_nivel` (`EVALUACION_NIVEL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tc_tipo_evaluacion1` FOREIGN KEY (`TIPO_EVALUACION_ID`) REFERENCES `tc_tipo_evaluacion` (`TIPO_EVALUACION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tr_alumnos1` FOREIGN KEY (`ALUMNOS_ID`) REFERENCES `tr_alumnos` (`ALUMNOS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tr_sesion1` FOREIGN KEY (`sesion_id`) REFERENCES `tr_sesion` (`sesion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_evaluacion_parcial_acumulativa`
--
ALTER TABLE `tr_evaluacion_parcial_acumulativa`
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_acumulativa1` FOREIGN KEY (`EVALUACION_ACUMULATIVA_ID`) REFERENCES `tr_evaluacion_acumulativa` (`EVALUACION_ACUMULATIVA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_parcial1` FOREIGN KEY (`EVALUACION_PARCIAL_ID`) REFERENCES `tr_evaluacion_parcial` (`EVALUACION_PARCIAL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_grupo_alumno`
--
ALTER TABLE `tr_grupo_alumno`
  ADD CONSTRAINT `fk_tr_grupo_alumno_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_grupo_alumno_tr_alumnos1` FOREIGN KEY (`ALUMNOS_ID`) REFERENCES `tr_alumnos` (`ALUMNOS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_grupo_carrera`
--
ALTER TABLE `tr_grupo_carrera`
  ADD CONSTRAINT `fk_TR_GRUPO_CARRERA_tc_carrera` FOREIGN KEY (`CARRERA_ID`) REFERENCES `tc_carrera` (`CARRERA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TR_GRUPO_CARRERA_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_maestros`
--
ALTER TABLE `tr_maestros`
  ADD CONSTRAINT `fk_tr_maestros_tr_usuario1` FOREIGN KEY (`USUARIO_ID`) REFERENCES `tr_usuario` (`USUARIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_maestro_grupo_materia`
--
ALTER TABLE `tr_maestro_grupo_materia`
  ADD CONSTRAINT `fk_tr_materia_grupo_materia_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_materia_grupo_materia_tc_materias1` FOREIGN KEY (`MATERIAS_ID`) REFERENCES `tc_materias` (`MATERIAS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_materia_grupo_materia_tr_maestros1` FOREIGN KEY (`MAESTRO_ID`) REFERENCES `tr_maestros` (`MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_materia_maestro_grupo_alumno`
--
ALTER TABLE `tr_materia_maestro_grupo_alumno`
  ADD CONSTRAINT `fk_tr_materia_maestro_grupo_alumno_tr_grupo_alumno1` FOREIGN KEY (`tr_grupo_alumno_GRUPO_ALUMNO_ID`) REFERENCES `tr_grupo_alumno` (`GRUPO_ALUMNO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_materia_maestro_grupo_alumno_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_presesion`
--
ALTER TABLE `tr_presesion`
  ADD CONSTRAINT `fk_tr_presesion_tr_criterio_competencia1` FOREIGN KEY (`CRITERIO_COMPETENCIA_ID`) REFERENCES `tr_criterio_competencia` (`CRITERIO_COMPETENCIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_presesion_rechazada`
--
ALTER TABLE `tr_presesion_rechazada`
  ADD CONSTRAINT `fk_tr_presesion_rechazada_tr_presesion1` FOREIGN KEY (`PRESESION_ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_sesion`
--
ALTER TABLE `tr_sesion`
  ADD CONSTRAINT `fk_tr_sesion_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_sesion_tr_presesion1` FOREIGN KEY (`PRESESION_ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tr_usuario`
--
ALTER TABLE `tr_usuario`
  ADD CONSTRAINT `fk_tr_usuario_tc_perfil1` FOREIGN KEY (`PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;