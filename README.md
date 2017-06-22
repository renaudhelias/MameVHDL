# MameVHDL
MameVHDL source code

1. MameVHDL/MameDSL : XText project, using C++/MAME grammar.
2. MameVHDL/MameModel : EMF project, with a Mame model, and a MameVHDL model.

Optionals :
* MameVHDL/testJFaceSWT : Plugin project, simple Hello World SWT.

# Description
This is an 18 days run using Agile Method, in order to test feasibility of translating MAME source code into VHDL.

MAME is written in C++, and is using Macro syntax. Idea here is to parse C++ and MAME Macro using a Eclipse Xtext grammar.

Xtext is synchronizing text entered with a model. Second idea here is to feed my own model (MameVHDL model) with this Xtext model (Mame model). And then using an model2text generator to build vhdl files, on VHDL file per component.

A third idea was using a "system bus" between components, using bidirectionnal wires. As it the final schematic could have only one common bus between all components.

# Several years later

Xtext is now largely quicker than when I created this project. That's good news.

The model2text technology I did use does disappears (deprecated). A problem with it was that I had to generate an Eclipse to create another Eclipse, it was really hard to use this model2text technology.

The "system bus" pattern is really slow to synthetis (compile), I succeed refactoring only one small VHDL project with this pattern (Space Invaders arcade). Bidirectionnal wires in FPGA project is not a nice idea, the less you have the better it is.

But all of this is not the reason of stopping this project. Main one is that I'm focussed on another project : CoreAmstrad. Could you clone me please ?

# MameVHDL demos
(http://www.youtube.com/watch?v=oSzX0kn6JSQ)

[![MameVHDL demo 1](http://img.youtube.com/vi/5K35K_MH2G4/0.jpg)](http://www.youtube.com/watch?v=5K35K_MH2G4)

[![MameVHDL demo 1.2](http://img.youtube.com/vi/w0qqnPUjKfc/0.jpg)](http://www.youtube.com/watch?v=w0qqnPUjKfc)
