CREATE DATABASE  IF NOT EXISTS `myMovieDb`;
USE `myMovieDb`;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `external_id` int(11) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `poster_path` varchar(250) DEFAULT NULL,
  `seen` boolean DEFAULT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

