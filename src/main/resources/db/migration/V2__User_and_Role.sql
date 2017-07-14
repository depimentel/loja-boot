DROP TABLE IF EXISTS system_role;

CREATE TABLE system_role(
  name VARCHAR(255) NOT NULL,

  CONSTRAINT PK_role PRIMARY KEY (name)
);

DROP TABLE IF EXISTS system_user;

CREATE TABLE system_user (
  id BIGSERIAL NOT NULL,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,

  CONSTRAINT PK_user PRIMARY KEY (id)
);


DROP TABLE IF EXISTS system_user_roles;

CREATE TABLE system_user_roles (
  user_id BIGINT NOT NULL,
  roles_name VARCHAR(255) NOT NULL,

  CONSTRAINT FK_many_to_many_user FOREIGN KEY (user_id) REFERENCES system_user(id),
  CONSTRAINT FK_many_to_many_role FOREIGN KEY (roles_name) REFERENCES system_role(name)
);


-- Insert Roles
INSERT INTO system_role(name) VALUES ('ROLE_ADMIN');
INSERT INTO system_role(name) VALUES ('ROLE_BUYER');

-- Insert Admin
INSERT INTO system_user(username, password) VALUES ('admin@casadocodigo.com.br', '$2a$10$3Qrx0rv8qSmZ8s3RlD5qE.upleP7.Qzbg5EoIAm62evEkY4c023TK');

-- join Admin to Role_Admin

INSERT INTO system_user_roles(user_id, roles_name) VALUES (1,'ROLE_ADMIN');