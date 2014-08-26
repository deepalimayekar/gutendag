public static readonly string sdMountPoint = "SD";
public static OutputPort LedRed = new OutputPort(Pins.GPIO_PIN_D0, false);
public static OutputPort LedGreen = new OutputPort(Pins.GPIO_PIN_D1, false);
public static InputPort CardDetect = new InputPort(Pins.GPIO_PIN_D3, true, Port.Resistormode.Pullup);
public static readonly Cpu.Pin ThermoCoupleChipSelect = Pins.GPIO_PIN_D2;
public static DS1307 Clock;
public static Max6675 ThermoCouple;

initiatePeripherals
