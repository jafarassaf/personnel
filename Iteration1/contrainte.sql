alter table UTILISATEUR
add constraint fk_idType
foreign key(idType) references TYPE_UTILISATEUR(idType);

alter table UTILISATEUR
add constraint fk_numLigue
foreign key(numLigue) references LIGUE(numLigue);