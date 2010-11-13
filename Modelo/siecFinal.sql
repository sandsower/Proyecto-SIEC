-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-11-2010 a las 16:02:06
-- Versión del servidor: 5.0.67
-- Versión de PHP: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `siec`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presesion_maestro`
--

CREATE TABLE IF NOT EXISTS `presesion_maestro` (
  `idpresesion_maestro` int(11) NOT NULL auto_increment,
  `tr_presesion__ID` int(11) NOT NULL,
  `tr_maestros_ID` int(11) NOT NULL,
  PRIMARY KEY  (`idpresesion_maestro`),
  KEY `fk_presesion_maestro_tr_presesion1` (`tr_presesion__ID`),
  KEY `fk_presesion_maestro_tr_maestros1` (`tr_maestros_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `presesion_maestro`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_carrera`
--

CREATE TABLE IF NOT EXISTS `tc_carrera` (
  `CARRERA_ID` int(11) NOT NULL auto_increment,
  `DES_CARRERA` varchar(45) default NULL,
  PRIMARY KEY  (`CARRERA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcar la base de datos para la tabla `tc_carrera`
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
-- Estructura de tabla para la tabla `tc_categorias`
--

CREATE TABLE IF NOT EXISTS `tc_categorias` (
  `CATEGORIA_ID` int(11) NOT NULL auto_increment,
  `DES_CATEGORIA` varchar(45) default NULL,
  `DESCRIPCION` varchar(255) default NULL,
  `ORDEN` int(11) default NULL,
  PRIMARY KEY  (`CATEGORIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcar la base de datos para la tabla `tc_categorias`
--

INSERT INTO `tc_categorias` (`CATEGORIA_ID`, `DES_CATEGORIA`, `DESCRIPCION`, `ORDEN`) VALUES
(1, 'TEORIA', 'SE EVALUA LA PARTE TEORICA', 1),
(2, 'PRACTICA', 'SE EVALUA LA APLICACION DE LA TEORIA', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_competencias`
--

CREATE TABLE IF NOT EXISTS `tc_competencias` (
  `COMPETENCIA_ID` int(11) NOT NULL auto_increment,
  `DES_COMPETENCIA` varchar(45) default NULL,
  `DESCRIPCION` varchar(255) default NULL,
  `CATEGORIA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`COMPETENCIA_ID`),
  KEY `fk_TC_COMPETENCIAS_CATEGORIAS` (`CATEGORIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `tc_competencias`
--

INSERT INTO `tc_competencias` (`COMPETENCIA_ID`, `DES_COMPETENCIA`, `DESCRIPCION`, `CATEGORIA_ID`) VALUES
(1, 'PROGRAMACIO ESTRUCTURADA', 'EL ALUMNO APRENDERA A REALIZAR CODIGOS CON UNA ESTRUCTURA ORDENADA Y LIMPIA TAMBIEN', 2),
(2, 'MANEJO DE CISCO', 'EL ALIMNO APRENDERA A REALIZAR REDES EN LA HERRAMIENTA CISCO ', 2),
(3, 'APRENDER ESTRATEGIAS DE DOCUMENTACION', 'EL ALUMNO APRENDERA A REALIZAR LA DOCUMENTACION NECESARIA PARA EL DESARROLLO DEL SOFTWARE', 1),
(4, 'SOLUCION DE ECUACIONES', 'EL ALUMNO APRENDERA A RESOLVER ECUACIONES MEDIANTE DIFERENTES TIPOS DE SOLUCION', 2),
(5, 'ABC', 'Nueva competencia', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_criterios`
--

CREATE TABLE IF NOT EXISTS `tc_criterios` (
  `CRITERIO_ID` int(11) NOT NULL auto_increment,
  `DES_CRITERIO` varchar(50) default NULL,
  `DESCRIPCION` varchar(255) default NULL,
  `Ponderacion` int(11) NOT NULL,
  PRIMARY KEY  (`CRITERIO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `tc_criterios`
--

INSERT INTO `tc_criterios` (`CRITERIO_ID`, `DES_CRITERIO`, `DESCRIPCION`, `Ponderacion`) VALUES
(1, 'REALIZAR METODS', 'EL ALUMNO APRENDERA A REALIZAR METODOS QUE PERMITAN COMPRENDER MAS UNCODIGO', 0),
(2, 'CREACION DE CLASES', 'EL ALUMNO APRENDERA A REALIZAR CLASESY METODOS BASICOS PARA EL DESARROLLO DE SOFTWARE', 0),
(3, 'PUNTUALIDAD', 'REALIZAR EN TIEMPO Y FORMA LAS ACTIVIDADES DE LA MATERIA', 0),
(4, 'REALIZAR VLANS', 'EL ALUMNO APRENDERA EL CONCEPTO Y ELABORACION DE VLANS', 0),
(5, 'ABC', 'Nuevo criterio', 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_departamentos`
--

CREATE TABLE IF NOT EXISTS `tc_departamentos` (
  `DEPARTAMENTO_ID` int(11) NOT NULL auto_increment,
  `DES_DEPARTAMENTO` varchar(45) default NULL,
  PRIMARY KEY  (`DEPARTAMENTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcar la base de datos para la tabla `tc_departamentos`
--

INSERT INTO `tc_departamentos` (`DEPARTAMENTO_ID`, `DES_DEPARTAMENTO`) VALUES
(1, 'MATEMATICAS'),
(2, 'IDIOMAS'),
(3, 'ISEI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_evaluacion_nivel`
--

CREATE TABLE IF NOT EXISTS `tc_evaluacion_nivel` (
  `EVALUACION_NIVEL_ID` int(11) NOT NULL auto_increment,
  `DES_EVALUACION` varchar(45) default NULL,
  PRIMARY KEY  (`EVALUACION_NIVEL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `tc_evaluacion_nivel`
--

INSERT INTO `tc_evaluacion_nivel` (`EVALUACION_NIVEL_ID`, `DES_EVALUACION`) VALUES
(1, 'COMPETENTE'),
(2, 'BASICO'),
(3, 'INDEPENDIENTE'),
(4, 'AVANZADO'),
(5, 'INCOMPETENTE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_grupo`
--

CREATE TABLE IF NOT EXISTS `tc_grupo` (
  `GRUPO_ID` int(11) NOT NULL auto_increment,
  `DES_GRUPO` varchar(45) default NULL,
  `CARRERA_ID` int(11) NOT NULL,
  `GRADO` varchar(45) default NULL,
  PRIMARY KEY  (`GRUPO_ID`),
  KEY `fk_TC_GRUPO_TC_CARRERA1` (`CARRERA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcar la base de datos para la tabla `tc_grupo`
--

INSERT INTO `tc_grupo` (`GRUPO_ID`, `DES_GRUPO`, `CARRERA_ID`, `GRADO`) VALUES
(4, '6', 1, 'A'),
(5, '6', 1, 'A'),
(6, '4', 2, 'B'),
(7, '3', 6, '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_materias`
--

CREATE TABLE IF NOT EXISTS `tc_materias` (
  `MATERIAS_ID` int(11) NOT NULL auto_increment,
  `DES_MATERIAS` varchar(45) default NULL,
  `DEPARTAMENTO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`MATERIAS_ID`),
  KEY `fk_tc_materias_tc_departamentos1` (`DEPARTAMENTO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `tc_materias`
--

INSERT INTO `tc_materias` (`MATERIAS_ID`, `DES_MATERIAS`, `DEPARTAMENTO_ID`) VALUES
(1, 'PROGRAMACION II', 3),
(2, 'CALCULO INTEGRAL', 1),
(3, 'INGLES VI', 2),
(4, 'Programacion V', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_perfil`
--

CREATE TABLE IF NOT EXISTS `tc_perfil` (
  `PERFIL_ID` int(11) NOT NULL auto_increment,
  `DES_PERFIL` varchar(45) default NULL,
  PRIMARY KEY  (`PERFIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `tc_perfil`
--

INSERT INTO `tc_perfil` (`PERFIL_ID`, `DES_PERFIL`) VALUES
(1, 'Maestro'),
(2, 'Alumno'),
(3, 'Dpa'),
(4, 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_reportes`
--

CREATE TABLE IF NOT EXISTS `tc_reportes` (
  `REPORTES_ID` int(11) NOT NULL auto_increment,
  `DES_REPORTES` varchar(45) default NULL,
  `PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY  (`REPORTES_ID`),
  KEY `fk_TC_REPORTES_TC_PERFIL1` (`PERFIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `tc_reportes`
--

INSERT INTO `tc_reportes` (`REPORTES_ID`, `DES_REPORTES`, `PERFIL_ID`) VALUES
(1, 'semanal', 1),
(2, 'informal', 2),
(3, 'informal', 3),
(4, 'parcial', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tc_tipo_evaluacion`
--

CREATE TABLE IF NOT EXISTS `tc_tipo_evaluacion` (
  `TIPO_EVALUACION_ID` int(11) NOT NULL auto_increment,
  `DES_TIPO_EVALUACION` varchar(45) default NULL,
  PRIMARY KEY  (`TIPO_EVALUACION_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcar la base de datos para la tabla `tc_tipo_evaluacion`
--

INSERT INTO `tc_tipo_evaluacion` (`TIPO_EVALUACION_ID`, `DES_TIPO_EVALUACION`) VALUES
(1, 'FORMATIVA'),
(2, 'ACUMULATIVA'),
(3, 'PARCIAL');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tl_menu`
--

CREATE TABLE IF NOT EXISTS `tl_menu` (
  `id_menu` int(11) NOT NULL,
  `menu` varchar(45) default NULL,
  `url` varchar(45) default NULL,
  `img` varchar(45) default NULL,
  `tc_perfil_PERFIL_ID` int(11) NOT NULL,
  PRIMARY KEY  (`id_menu`),
  KEY `fk_tl_menu_tc_perfil1` (`tc_perfil_PERFIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tl_menu`
--

INSERT INTO `tl_menu` (`id_menu`, `menu`, `url`, `img`, `tc_perfil_PERFIL_ID`) VALUES
(1, 'Competencias', 'Competencias/Asignar/grupos.jsp', 'competencias', 1),
(2, 'Reportes', 'reportes.jsp', 'reportes', 1),
(3, 'Evaluaciones Formativas', 'evaluacionesf.jsp', 'formativas', 1),
(4, 'Evaluaciones Acumulativa', 'evaluacionesa.jsp', 'acumulativas', 1),
(5, 'Estrategias', 'estrategias/', 'estrategias', 1),
(6, 'Auto-Evaluacion', 'competencias.jsp', 'autoevaluacion', 2),
(7, 'Evaluaciones Formaticas', 'evaluaciones.jsp', 'formativas', 2),
(8, 'Competencias', 'competencias.jsp', 'competencias', 3),
(9, 'Revisiones', 'revisiones.jsp', 'revisiones', 3),
(10, 'Criterios', 'criterios.jsp', 'criterios', 3),
(11, 'Reportes', 'reportes.jsp', 'reportes', 3),
(12, 'Estrategias', 'evaluaciones.jsp', 'estrategias', 3),
(13, 'Competencias', 'competencias.jsp', 'competencias', 4),
(14, 'Criterios', 'criterios.jsp', 'criterios', 4),
(15, 'Reportes', 'reportes.jsp', 'reportes', 4),
(16, 'Estrategias', 'evaluaciones.jsp', 'estrategias', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_alumnos`
--

CREATE TABLE IF NOT EXISTS `tr_alumnos` (
  `ALUMNOS_ID` int(11) NOT NULL auto_increment,
  `MATRICULA` varchar(45) default NULL,
  `USUARIO_ID` int(11) NOT NULL,
  `CARRERA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`ALUMNOS_ID`),
  KEY `fk_TC_ALUMNOS_TC_USUARIO1` (`USUARIO_ID`),
  KEY `fk_TR_ALUMNOS_TC_CARRERA1` (`CARRERA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_alumnos`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_criterio_competencia`
--

CREATE TABLE IF NOT EXISTS `tr_criterio_competencia` (
  `CRITERIO_COMPETENCIA_ID` int(11) NOT NULL auto_increment,
  `PONDERACION_CRITERIO` varchar(45) default NULL,
  `CRITERIO_ID` int(11) NOT NULL,
  `COMPETENCIA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`CRITERIO_COMPETENCIA_ID`),
  KEY `fk_TR_CRITERIO_COMPETENCIA_TC_CRITERIOS1` (`CRITERIO_ID`),
  KEY `fk_TR_CRITERIO_COMPETENCIA_TC_COMPETENCIAS1` (`COMPETENCIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `tr_criterio_competencia`
--

INSERT INTO `tr_criterio_competencia` (`CRITERIO_COMPETENCIA_ID`, `PONDERACION_CRITERIO`, `CRITERIO_ID`, `COMPETENCIA_ID`) VALUES
(2, '9', 1, 1),
(3, '10', 2, 2),
(4, '9', 3, 3),
(5, '8', 4, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_estrategias`
--

CREATE TABLE IF NOT EXISTS `tr_estrategias` (
  `ESTRATEGIA_ID` int(11) NOT NULL auto_increment,
  `FECHA_INICIO_REGISTRO` date default NULL,
  `MENSAJE` varchar(45) default NULL,
  `FECHA_CAMBIO` date default NULL,
  PRIMARY KEY  (`ESTRATEGIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Volcar la base de datos para la tabla `tr_estrategias`
--

INSERT INTO `tr_estrategias` (`ESTRATEGIA_ID`, `FECHA_INICIO_REGISTRO`, `MENSAJE`, `FECHA_CAMBIO`) VALUES
(16, '0000-00-00', 'Estudiar mas', '0000-00-00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_estra_mgm`
--

CREATE TABLE IF NOT EXISTS `tr_estra_mgm` (
  `estra_mgm_id` int(11) NOT NULL auto_increment,
  `ESTRATEGIA_ID` int(11) NOT NULL,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `mgma_id` int(11) NOT NULL,
  PRIMARY KEY  (`estra_mgm_id`),
  KEY `fk_estra_mgm_tr_estrategias1` (`ESTRATEGIA_ID`),
  KEY `fk_estra_mgm_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_estra_mgm_tr_materia_maestro_grupo_alumno1` (`mgma_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_estra_mgm`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_est_alumno`
--

CREATE TABLE IF NOT EXISTS `tr_est_alumno` (
  `EST_ALUMNO_ID` int(11) NOT NULL auto_increment,
  `ESTRATEGIA_ID` int(11) NOT NULL,
  `MGMA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`EST_ALUMNO_ID`),
  KEY `fk_EST_ALUMNO_tr_estrategias1` (`ESTRATEGIA_ID`),
  KEY `fk_EST_ALUMNO_tr_materia_maestro_grupo_alumno1` (`MGMA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_est_alumno`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_evaluacion_acumulativa`
--

CREATE TABLE IF NOT EXISTS `tr_evaluacion_acumulativa` (
  `EVALUACION_ACUMULATIVA_ID` int(11) NOT NULL auto_increment,
  `PARCIAL` int(11) default NULL,
  `CALIFICACION` int(11) default NULL,
  PRIMARY KEY  (`EVALUACION_ACUMULATIVA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `tr_evaluacion_acumulativa`
--

INSERT INTO `tr_evaluacion_acumulativa` (`EVALUACION_ACUMULATIVA_ID`, `PARCIAL`, `CALIFICACION`) VALUES
(1, 1, 9),
(2, 2, 10),
(3, 3, 8),
(4, 2, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_evaluacion_parcial`
--

CREATE TABLE IF NOT EXISTS `tr_evaluacion_parcial` (
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
  KEY `fk_tr_evaluacion_parcial_tr_sesion1` (`sesion_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_evaluacion_parcial`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_evaluacion_parcial_acumulativa`
--

CREATE TABLE IF NOT EXISTS `tr_evaluacion_parcial_acumulativa` (
  `EVALUACION_PARCIAL_ACUMULATIVA_ID` int(11) NOT NULL auto_increment,
  `EVALUACION_PARCIAL_ID` int(11) NOT NULL,
  `EVALUACION_ACUMULATIVA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`EVALUACION_PARCIAL_ACUMULATIVA_ID`),
  KEY `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_parcial1` (`EVALUACION_PARCIAL_ID`),
  KEY `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_acumulativa1` (`EVALUACION_ACUMULATIVA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_evaluacion_parcial_acumulativa`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_grupo_alumno`
--

CREATE TABLE IF NOT EXISTS `tr_grupo_alumno` (
  `GRUPO_ALUMNO_ID` int(11) NOT NULL auto_increment,
  `GRUPO_ID` int(11) NOT NULL,
  `ALUMNOS_ID` int(11) NOT NULL,
  PRIMARY KEY  (`GRUPO_ALUMNO_ID`),
  KEY `fk_tr_grupo_alumno_tc_grupo1` (`GRUPO_ID`),
  KEY `fk_tr_grupo_alumno_tr_alumnos1` (`ALUMNOS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_grupo_alumno`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_grupo_carrera`
--

CREATE TABLE IF NOT EXISTS `tr_grupo_carrera` (
  `GRUPO_CARRERA_ID` int(11) NOT NULL auto_increment,
  `CARRERA_ID` int(11) NOT NULL,
  `GRUPO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`GRUPO_CARRERA_ID`),
  KEY `fk_TR_GRUPO_CARRERA_tc_carrera` (`CARRERA_ID`),
  KEY `fk_TR_GRUPO_CARRERA_tc_grupo1` (`GRUPO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_grupo_carrera`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_maestros`
--

CREATE TABLE IF NOT EXISTS `tr_maestros` (
  `MAESTRO_ID` int(11) NOT NULL auto_increment,
  `CODIGO` varchar(45) default NULL,
  `USUARIO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`MAESTRO_ID`),
  KEY `fk_tr_maestros_tr_usuario1` (`USUARIO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `tr_maestros`
--

INSERT INTO `tr_maestros` (`MAESTRO_ID`, `CODIGO`, `USUARIO_ID`) VALUES
(1, 'ma131221', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_maestro_grupo_materia`
--

CREATE TABLE IF NOT EXISTS `tr_maestro_grupo_materia` (
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL auto_increment,
  `GRUPO_ID` int(11) NOT NULL,
  `MATERIAS_ID` int(11) NOT NULL,
  `MAESTRO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_materia_grupo_materia_tc_grupo1` (`GRUPO_ID`),
  KEY `fk_tr_materia_grupo_materia_tc_materias1` (`MATERIAS_ID`),
  KEY `fk_tr_materia_grupo_materia_tr_maestros1` (`MAESTRO_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcar la base de datos para la tabla `tr_maestro_grupo_materia`
--

INSERT INTO `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`, `GRUPO_ID`, `MATERIAS_ID`, `MAESTRO_ID`) VALUES
(1, 4, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_materia_maestro_grupo_alumno`
--

CREATE TABLE IF NOT EXISTS `tr_materia_maestro_grupo_alumno` (
  `materia_maestro_grupo_alumno_id` int(11) NOT NULL auto_increment,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `tr_grupo_alumno_GRUPO_ALUMNO_ID` int(11) NOT NULL,
  PRIMARY KEY  (`materia_maestro_grupo_alumno_id`),
  KEY `fk_tr_materia_maestro_grupo_alumno_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_materia_maestro_grupo_alumno_tr_grupo_alumno1` (`tr_grupo_alumno_GRUPO_ALUMNO_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_materia_maestro_grupo_alumno`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_presesion`
--

CREATE TABLE IF NOT EXISTS `tr_presesion` (
  `PRESESION_ID` int(11) NOT NULL auto_increment,
  `MENSAJE` varchar(255) default NULL,
  `ESTADO` int(11) default NULL,
  `PONDERACION` varchar(45) default NULL,
  `CRITERIO_COMPETENCIA_ID` int(11) NOT NULL,
  PRIMARY KEY  (`PRESESION_ID`),
  KEY `fk_tr_presesion_tr_criterio_competencia1` (`CRITERIO_COMPETENCIA_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcar la base de datos para la tabla `tr_presesion`
--

INSERT INTO `tr_presesion` (`PRESESION_ID`, `MENSAJE`, `ESTADO`, `PONDERACION`, `CRITERIO_COMPETENCIA_ID`) VALUES
(6, 'Mensaje de la presesion 1', 0, '80', 2),
(7, 'Mensaje de la presesion 2 ', 1, '70', 3),
(8, 'Mensaje de la presesion 3', 1, '60', 4),
(9, 'Mensaje de la presesion 4', 0, '50', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_presesion_rechazada`
--

CREATE TABLE IF NOT EXISTS `tr_presesion_rechazada` (
  `SESION_RECHAZADA_ID` int(11) NOT NULL auto_increment,
  `MENSAJE` varchar(45) default NULL,
  `PRESESION_ID` int(11) NOT NULL,
  PRIMARY KEY  (`SESION_RECHAZADA_ID`),
  KEY `fk_tr_presesion_rechazada_tr_presesion1` (`PRESESION_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcar la base de datos para la tabla `tr_presesion_rechazada`
--

INSERT INTO `tr_presesion_rechazada` (`SESION_RECHAZADA_ID`, `MENSAJE`, `PRESESION_ID`) VALUES
(5, 'Fallida por falta de criterios', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_sesion`
--

CREATE TABLE IF NOT EXISTS `tr_sesion` (
  `sesion_id` int(11) NOT NULL auto_increment,
  `MATERIA_GRUPO_MAESTRO_ID` int(11) NOT NULL,
  `PRESESION_ID` int(11) NOT NULL,
  `ESTADO` tinyint(1) default NULL,
  PRIMARY KEY  (`sesion_id`),
  KEY `fk_tr_sesion_tr_materia_grupo_materia1` (`MATERIA_GRUPO_MAESTRO_ID`),
  KEY `fk_tr_sesion_tr_presesion1` (`PRESESION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `tr_sesion`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tr_usuario`
--

CREATE TABLE IF NOT EXISTS `tr_usuario` (
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
  KEY `fk_tr_usuario_tc_perfil1` (`PERFIL_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcar la base de datos para la tabla `tr_usuario`
--

INSERT INTO `tr_usuario` (`USUARIO_ID`, `NOMBRES`, `APELLIDO_PATERNO`, `APELLIDO_MATERNO`, `FECHA_NAC`, `USUARIO`, `PASSWORD`, `IMAGEN`, `PERFIL_ID`) VALUES
(1, 'Esteban Alberto', 'Uscanga', 'Olea', '10/10/10', 'darknavi', 'darknavi', 'dsadsa.jpg', 2),
(2, 'Omar ', 'Rosales', 'Hernandez', '10/10/1950', 'omar', 'omar', 'dasvas.jpg', 1);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `presesion_maestro`
--
ALTER TABLE `presesion_maestro`
  ADD CONSTRAINT `fk_presesion_maestro_tr_maestros1` FOREIGN KEY (`tr_maestros_ID`) REFERENCES `tr_maestros` (`MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_presesion_maestro_tr_presesion1` FOREIGN KEY (`tr_presesion__ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tc_competencias`
--
ALTER TABLE `tc_competencias`
  ADD CONSTRAINT `fk_TC_COMPETENCIAS_CATEGORIAS` FOREIGN KEY (`CATEGORIA_ID`) REFERENCES `tc_categorias` (`CATEGORIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tc_materias`
--
ALTER TABLE `tc_materias`
  ADD CONSTRAINT `fk_tc_materias_tc_departamentos1` FOREIGN KEY (`DEPARTAMENTO_ID`) REFERENCES `tc_departamentos` (`DEPARTAMENTO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tc_reportes`
--
ALTER TABLE `tc_reportes`
  ADD CONSTRAINT `fk_TC_REPORTES_TC_PERFIL1` FOREIGN KEY (`PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tl_menu`
--
ALTER TABLE `tl_menu`
  ADD CONSTRAINT `fk_tl_menu_tc_perfil1` FOREIGN KEY (`tc_perfil_PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_alumnos`
--
ALTER TABLE `tr_alumnos`
  ADD CONSTRAINT `fk_TC_ALUMNOS_TC_USUARIO1` FOREIGN KEY (`USUARIO_ID`) REFERENCES `tr_usuario` (`USUARIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TR_ALUMNOS_TC_CARRERA1` FOREIGN KEY (`CARRERA_ID`) REFERENCES `tc_carrera` (`CARRERA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_criterio_competencia`
--
ALTER TABLE `tr_criterio_competencia`
  ADD CONSTRAINT `fk_TR_CRITERIO_COMPETENCIA_TC_COMPETENCIAS1` FOREIGN KEY (`COMPETENCIA_ID`) REFERENCES `tc_competencias` (`COMPETENCIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TR_CRITERIO_COMPETENCIA_TC_CRITERIOS1` FOREIGN KEY (`CRITERIO_ID`) REFERENCES `tc_criterios` (`CRITERIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_estra_mgm`
--
ALTER TABLE `tr_estra_mgm`
  ADD CONSTRAINT `fk_estra_mgm_tr_estrategias1` FOREIGN KEY (`ESTRATEGIA_ID`) REFERENCES `tr_estrategias` (`ESTRATEGIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_estra_mgm_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_estra_mgm_tr_materia_maestro_grupo_alumno1` FOREIGN KEY (`mgma_id`) REFERENCES `tr_materia_maestro_grupo_alumno` (`materia_maestro_grupo_alumno_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_est_alumno`
--
ALTER TABLE `tr_est_alumno`
  ADD CONSTRAINT `fk_EST_ALUMNO_tr_estrategias1` FOREIGN KEY (`ESTRATEGIA_ID`) REFERENCES `tr_estrategias` (`ESTRATEGIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_evaluacion_parcial`
--
ALTER TABLE `tr_evaluacion_parcial`
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tc_evaluacion_nivel1` FOREIGN KEY (`EVALUACION_NIVEL_ID`) REFERENCES `tc_evaluacion_nivel` (`EVALUACION_NIVEL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tc_tipo_evaluacion1` FOREIGN KEY (`TIPO_EVALUACION_ID`) REFERENCES `tc_tipo_evaluacion` (`TIPO_EVALUACION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tr_alumnos1` FOREIGN KEY (`ALUMNOS_ID`) REFERENCES `tr_alumnos` (`ALUMNOS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_tr_sesion1` FOREIGN KEY (`sesion_id`) REFERENCES `tr_sesion` (`sesion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_evaluacion_parcial_acumulativa`
--
ALTER TABLE `tr_evaluacion_parcial_acumulativa`
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_acumulativa1` FOREIGN KEY (`EVALUACION_ACUMULATIVA_ID`) REFERENCES `tr_evaluacion_acumulativa` (`EVALUACION_ACUMULATIVA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_evaluacion_parcial_acumulativa_tr_evaluacion_parcial1` FOREIGN KEY (`EVALUACION_PARCIAL_ID`) REFERENCES `tr_evaluacion_parcial` (`EVALUACION_PARCIAL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_grupo_alumno`
--
ALTER TABLE `tr_grupo_alumno`
  ADD CONSTRAINT `fk_tr_grupo_alumno_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_grupo_alumno_tr_alumnos1` FOREIGN KEY (`ALUMNOS_ID`) REFERENCES `tr_alumnos` (`ALUMNOS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_grupo_carrera`
--
ALTER TABLE `tr_grupo_carrera`
  ADD CONSTRAINT `fk_TR_GRUPO_CARRERA_tc_carrera` FOREIGN KEY (`CARRERA_ID`) REFERENCES `tc_carrera` (`CARRERA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_TR_GRUPO_CARRERA_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_maestros`
--
ALTER TABLE `tr_maestros`
  ADD CONSTRAINT `fk_tr_maestros_tr_usuario1` FOREIGN KEY (`USUARIO_ID`) REFERENCES `tr_usuario` (`USUARIO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_maestro_grupo_materia`
--
ALTER TABLE `tr_maestro_grupo_materia`
  ADD CONSTRAINT `fk_tr_materia_grupo_materia_tc_grupo1` FOREIGN KEY (`GRUPO_ID`) REFERENCES `tc_grupo` (`GRUPO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_materia_grupo_materia_tc_materias1` FOREIGN KEY (`MATERIAS_ID`) REFERENCES `tc_materias` (`MATERIAS_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_materia_grupo_materia_tr_maestros1` FOREIGN KEY (`MAESTRO_ID`) REFERENCES `tr_maestros` (`MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_materia_maestro_grupo_alumno`
--
ALTER TABLE `tr_materia_maestro_grupo_alumno`
  ADD CONSTRAINT `fk_tr_materia_maestro_grupo_alumno_tr_grupo_alumno1` FOREIGN KEY (`tr_grupo_alumno_GRUPO_ALUMNO_ID`) REFERENCES `tr_grupo_alumno` (`GRUPO_ALUMNO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_materia_maestro_grupo_alumno_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_presesion`
--
ALTER TABLE `tr_presesion`
  ADD CONSTRAINT `fk_tr_presesion_tr_criterio_competencia1` FOREIGN KEY (`CRITERIO_COMPETENCIA_ID`) REFERENCES `tr_criterio_competencia` (`CRITERIO_COMPETENCIA_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_presesion_rechazada`
--
ALTER TABLE `tr_presesion_rechazada`
  ADD CONSTRAINT `fk_tr_presesion_rechazada_tr_presesion1` FOREIGN KEY (`PRESESION_ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_sesion`
--
ALTER TABLE `tr_sesion`
  ADD CONSTRAINT `fk_tr_sesion_tr_materia_grupo_materia1` FOREIGN KEY (`MATERIA_GRUPO_MAESTRO_ID`) REFERENCES `tr_maestro_grupo_materia` (`MATERIA_GRUPO_MAESTRO_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_tr_sesion_tr_presesion1` FOREIGN KEY (`PRESESION_ID`) REFERENCES `tr_presesion` (`PRESESION_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tr_usuario`
--
ALTER TABLE `tr_usuario`
  ADD CONSTRAINT `fk_tr_usuario_tc_perfil1` FOREIGN KEY (`PERFIL_ID`) REFERENCES `tc_perfil` (`PERFIL_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
