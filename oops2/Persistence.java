package oops2;

public abstract class Persistence {abstract public String persist();
}
class FilePersistence extends Persistence{

	@Override
	public String persist() {
		return "File Persistence Method";
	}
}
class DataBasePersistence extends Persistence{

	@Override
	public String persist() {
		return "Data Base Persistence Method";
	}
}
class Client extends Persistence{

	@Override
	public String persist() {
		return "Invokes a Persist Method";
	}
}
