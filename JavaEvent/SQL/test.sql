/* INSERT USERS */
INSERT INTO Users(email, password, firstName, lastName, departement) VALUES ('jackie@gmail.com', 'bébé', 'Jackie', 'Lopoto', 'ADMINISTRATION');

INSERT INTO Users(email, password, firstName, lastName, departement) VALUES ('jeremilehn@gmail.com', 'bash', 'jérémy', 'lehn', 'INFO');

INSERT INTO Users(email, password, firstName, lastName, departement) VALUES ('BernadettePastaure@gmail.com', 'fake', 'bernadette', 'pastaure', 'ETN');

/* INSERT AN ORGANIZATION */

INSERT INTO Organization(name, leader) VALUES ('Idesys', 3);

/* INSERT MEMBER IN AN ORGANIZATION */

INSERT INTO Members(user, organization) VALUES (3, 4);

/* EVENT CREATED BY AN USER */

INSERT INTO Events(name, summary, creator_id) VALUES ('Gouter chez moi', 'Un bon petit gouter au calme', 2);

/* EVENT CREATED BY AN ORGANIZATION */

INSERT INTO Events(name, summary, creator_id) VALUES ('Afterwork gros projets', 'On va se faire un max de thunes', 4);

