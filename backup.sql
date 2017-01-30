SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `test`.`login`;
CREATE TABLE `test`.`login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `job` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ;
INSERT INTO `test`.`login` VALUES ('1', 'a', 'a', 'ceo');
INSERT INTO `test`.`login` VALUES ('2', 'b', 'b', 'emploee');

DROP TABLE IF EXISTS `test`.`staff`;
CREATE TABLE `test`.`staff`(
`sid` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
`lastname` varchar(255) NOT NULL,
`duty` varchar(255) NOT NULL,

PRIMARY KEY (`sid`)
);

INSERT INTO `test`.`staff` VALUES ('1', 'ΠΑΝΑΓΙΩΤΗΣ', 'ΤΑΜΒΑΚΙΔΗΣ', 'ADMIN');
INSERT INTO `test`.`staff` VALUES ('2', 'ΑΡΤΕΜΗΣ', 'ΜΥΤΙΛΗΝΑΙΟΣ', 'ADMIN');
INSERT INTO `test`.`staff` VALUES ('3', 'ΓΙΩΡΓΟΣ', 'ΠΑΡΑΣΚΕΥΟΠΟΥΛΟΣ', 'CHEF');
INSERT INTO `test`.`staff` VALUES ('4', 'ΜΑΡΙΑ', 'ΔΕΝΑΞΑ', 'RECEPTION');
INSERT INTO `test`.`staff` VALUES ('5', 'ΠΑΝΤΕΛΗΣ', 'ΚΑΠΕΤΑΝΟΣ', 'ROOM SERVICE');
INSERT INTO `test`.`staff` VALUES ('6', 'ΣΤΕΦΑΝΙΑ', 'ΠΑΠΠΑ', 'ΚΑΘΑΡΙΣΜΟΣ');

DROP TABLE IF EXISTS `test`.`rooms`;
CREATE TABLE `test`.`rooms`(
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(255) NOT NULL,
  `floor` int(11) NOT NULL,
  `price` varchar(255) NOT NULL,
  `space` varchar(255) NOT NULL,
  `special_offer` varchar(255) ,
  PRIMARY KEY (`rid`)

);
 INSERT INTO `test`.`rooms` VALUES ('1', 'ΔΩΜΑΤΙΟ 1', '1', '30€/Η','2','');
 INSERT INTO `test`.`rooms` VALUES ('2', 'ΔΩΜΑΤΙΟ 2', '1', '30€/Η','2','');
 INSERT INTO `test`.`rooms` VALUES ('3', 'ΔΩΜΑΤΙΟ 3', '1', '30€/Η','2','');
 INSERT INTO `test`.`rooms` VALUES ('4', 'ΔΩΜΑΤΙΟ 4', '1', '30€/Η','2','');
 INSERT INTO `test`.`rooms` VALUES ('5', 'ΔΩΜΑΤΙΟ 5', '1', '30€/Η','2','');
 INSERT INTO `test`.`rooms` VALUES ('6', 'ΔΩΜΑΤΙΟ 6', '2', '50€/Η','3','');
 INSERT INTO `test`.`rooms` VALUES ('7', 'ΔΩΜΑΤΙΟ 7', '2', '50€/Η','3','');
 INSERT INTO `test`.`rooms` VALUES ('8', 'ΔΩΜΑΤΙΟ 8', '2', '50€/Η','3','');
 INSERT INTO `test`.`rooms` VALUES ('9', 'ΔΩΜΑΤΙΟ 9', '3', '100€/Η','4+','');
 INSERT INTO `test`.`rooms` VALUES ('10','ΔΩΜΑΤΙΟ 10','3','100€/Η','4+','');
 
DROP TABLE IF EXISTS `test`.`bookings`;
CREATE TABLE `test`.`bookings`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `people` int(11) NOT NULL,
  `sd` varchar(255) NOT NULL,
  `ld` varchar(255) NOT NULL,
  `room` int (11) NOT NULL,
  
  PRIMARY KEY (`id`)

);
