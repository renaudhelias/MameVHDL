package enumportbit;

public enum EnumPortFlag {
	PORT_2WAY(EnumPortGroup.JOYSTICK),
	PORT_4WAY(EnumPortGroup.JOYSTICK),
	PORT_8WAY(EnumPortGroup.JOYSTICK),
	PORT_16WAY(EnumPortGroup.JOYSTICK),
	PORT_ROTATED(EnumPortGroup.JOYSTICK),
	PORT_COCKTAIL(EnumPortGroup.GENERAL),
	PORT_TOGGLE(EnumPortGroup.GENERAL),
	PORT_IMPULSE(EnumPortGroup.GENERAL),
	PORT_REVERSE(EnumPortGroup.GENERAL),
	PORT_RESET(EnumPortGroup.GENERAL),
	PORT_UNUSED(EnumPortGroup.GENERAL),
	PORT_INVERT(EnumPortGroup.POSITIONAL_CONTROL)
	;
	private EnumPortGroup group;

	EnumPortFlag(EnumPortGroup group) {
		this.group = group;
	}
	public EnumPortGroup getGroup() {
		return group;
	}
}
