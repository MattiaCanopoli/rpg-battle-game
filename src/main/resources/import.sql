INSERT INTO character_classes (constitution,dexterity,intelligence,name,strength,wisdom) VALUES (10,10,10,'test class',10,10);
INSERT INTO inventories (quantity) VALUES (10);
INSERT INTO races (constitution,dexterity,intelligence,strength,wisdom,name) VALUES (10,10,10,10,10,'test race');
INSERT INTO items (constitution,damage_mod,dexterity,heal,intelligence,inventory_id,strength,value,wisdom,damage_parameter,description,name,type) VALUES (0,1,0,0,1,1,0,10,0,'intelligence','test description','test item name','test type');
INSERT INTO item_character_class (character_classes_id,item_id) VALUES (1,1);
INSERT INTO creatures (character_class_id,constitution,dexterity,exp,intelligence,inventory_id,level,life_points,money,race_id,strength,wisdom,name,type) VALUES (1,10,10,0,10,1,1,10,0,1,10,10,'test creature','test type');
