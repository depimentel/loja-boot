DROP TABLE IF EXISTS role;

CREATE TABLE role(
  name VARCHAR(255) NOT NULL,

  CONSTRAINT PK_role PRIMARY KEY (name)
);

DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id BIGINT NOT NULL AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,

  CONSTRAINT PK_user PRIMARY KEY (id)
);


DROP TABLE IF EXISTS user_roles;

CREATE TABLE user_roles (
  user_id BIGINT NOT NULL,
  roles_name VARCHAR(255) NOT NULL,

  CONSTRAINT FK_many_to_many_user FOREIGN KEY (user_id) REFERENCES user(id),
  CONSTRAINT FK_many_to_many_role FOREIGN KEY (roles_name) REFERENCES role(name)
);


-- Insert Roles
INSERT role(name) VALUES ('ROLE_ADMIN');
INSERT role(name) VALUES ('ROLE_BUYER');

-- Insert Admin
INSERT user(username, password) VALUES ('admin@casadocodigo.com.br', '$2a$10$3Qrx0rv8qSmZ8s3RlD5qE.upleP7.Qzbg5EoIAm62evEkY4c023TK');

-- join Admin to Role_Admin

INSERT user_roles(user_id, roles_name) VALUES (1,'ROLE_ADMIN');