# MameVHDL
MameVHDL source code : EMF project, with a Mame model, and a MameVHDL model.

Do create a "EMF project" called com.wordpress.mamevhdl.models, with this files on it :
* model/MameModel.ecore
* model/MameModel.genmodel
* model/MameVHDLModel.ecore
* model/MameVHDLModel.genmodel

Do generate all on opened genmodel files (right click on root element), it must result a generated "MameVHDLModel" project with on it src two packages : mameModel and mameVHDLModel

Some java files ares missing on generated projets, do add them into the previously generated "MameVHDLModel" project :
* src/enumportbit/*.java
* src/enumromload/*.java

Launch the "com.wordpress.mamevhdl.ui" project as "Eclipse Application", do create a new "MameModel Model" file :)