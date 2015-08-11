# MameVHDL
MameVHDL source code
XText project, using C++/MAME grammar.

Download XText "Full Eclipse" at https://eclipse.org/Xtext/download.html

Create a new Xtext project like this :
* Project name : com.wordpress.mamevhdl
* Language/Name : com.wordpress.mamevhdl.MameDSL
* Language/Extensions : mame

Edit 2 fragments in src/com.wordpress.mamevhdl/GenerateMameDSL.mwe2 in order to gain in performance :

	// The antlr parser generator fragment.
	fragment = parser.antlr.XtextAntlrGeneratorFragment auto-inject {
	//  options = {
	//      backtrack = true
	//  }
	  options = {
		  backtrack = true // non respect des grammaire LL(*)
		  memoize = true // optim memoire + determinisme
		  //k = 0 on n'est plus en LL(k) de toute façon...
		  classSplitting = true
	  }
	  antlrParam = "-Xconversiontimeout" antlrParam = "30000"
	}
	
	
	// generates a more lightweight Antlr parser and lexer tailored for content assist
	fragment = parser.antlr.XtextAntlrUiGeneratorFragment auto-inject {
	options = {
		  backtrack = true // non respect des grammaire LL(*)
		  memoize = true // optim memoire + determinisme
		  //k = 0 on n'est plus en LL(k) de toute façon...
		  classSplitting = true
	  }
	  antlrParam = "-Xconversiontimeout" antlrParam = "30000"
	}

Right click on src/com.wordpress.mamevhdl/GenerateMameDSL.mwe2 > Run As > MWE2 workflow
Here strange messages about "downloading" http://download.itemis.com/updates/

wget -r -np http://download.itemis.com/updates/releases/2.1.1/

Install it into correct eclipse folders (features and plugins)

Right click on src/com.wordpress.mamevhdl/GenerateMameDSL.mwe2 > Run As > MWE2 workflow
Launch the "com.wordpress.mamevhdl.ui" project as "Eclipse Application", do create a new file called "test.mame" in a new project, or else right click in a file >open with>Other...>"MameDSL editor".

Do enter the sample :
void main() {
}

That shall be colorfull :)

