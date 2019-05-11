CREATE TABLE `user` (
`id`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL ,
`username`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
`password`  varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci
ROW_FORMAT=DYNAMIC
;
INSERT INTO `user1` (`id`, `username`, `password`) VALUES ('8f5689836eef11e9869d000c29242eff', 'stephen', 'aaaaaaaaaaaaaaaaa');