// Grzegorz Ko�czak, 31.08.2016
// Special section - building compiler
// Exercise from Java:How to program 10th edition

package simpletron.instructionSet;

import simpletron.hardware.Memory;

public abstract class InstructionIO extends Instruction{
	
	private Memory memory;

	public InstructionIO(Integer operand, Memory memory) {
		super(operand);
		this.memory = memory;
	}
	
	

	public Memory getMemory() {
		return memory;
	}

}
