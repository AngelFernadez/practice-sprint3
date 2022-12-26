INSERT INTO `rol`(`id`, `rol`)
values (1, 'BUYER'),
       (2, 'ADMIN');

INSERT INTO `users`(`id`, `username`, `password`)
values (1, 'buyer', '123'),
       (2, 'admin', '123'),
       (3, 'max power', '123');

INSERT INTO `users_roles`(`user_id`, `roles_id`)
values (1, 1),
       (2, 2),
       (3, 1),
       (3, 2);