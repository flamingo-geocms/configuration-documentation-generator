The Flamingo-mc Configuration Documentation Generator.
The applic creates xml out of the comments in the .as files created for flamingo.

it accepts 3 arguments:
First: Source dir/file where the .as file(s) are located
Second: Destination dir for the new xml files
the param -f if added the generator will create a xml for every .as file. 
	if ommited (default) the generator will only try to generate xml files for .as files with a .fla file.
	
	
Dont forget to copy the xsl file and the css file in the xslt dir to the destination dir.