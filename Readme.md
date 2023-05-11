# Simple Assembly Language

* This is a simple assembly language that has 3 operations:
* MV: This operation is used to get a constant into a register of the form MV REG,#CONST. For example, MV REG1,#2000 will move the constant value of 2000 into register 1 and MV REG2,#4000 will move the constant value of 4000 into register 
* ADD: This operation is used to add two registers or a register and a constant together and save the result in the first register. The syntax is ADD DEST, SRC or ADD DEST,#CONST. For example, ADD REG1,REG2 will add the contents of register 2 to register 1 and save the result in register 1. Similarly, ADD REG1,600 will add the constant value of 600 to register 1 and save the result in register 
* SHOW: This operation is used to show the contents of a register. The syntax is SHOW REG. For example, SHOW REG1 will display the contents of register 

## Usage
* To use this assembly language, create a file containing one or more MV statements and an ADD statement, and save it with the file extension .s. For example:

## Sample codes
* MV REG1,#2000
* MV REG2,#4000
* ADD REG1,REG2
* SHOW REG1
* Then, run the Java program Assembler.java with the filename as a command line argument. For example, if the file is named program.s, run the following command:

## Copy code
* java Assembler program.s
* The program will assemble the code, execute it, and display the result of the SHOW statement.

## Notes
* Registers are denoted by the prefix REG followed by a number, e.g., REG1, REG2, etc.
* Constants are denoted by the # symbol followed by a number, e.g., #2000, #4000, etc.
* The program only supports integer arithmetic.
* The program assumes that the input file contains valid assembly code. It does not perform any error checking or handling.