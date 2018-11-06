public class Wilder{
	//	Les Attrinu de ma class
	private String firstname;
	private boolean aware;

	//	Le Constructeur de ma class
	public Wilder(String firstname, boolean aware){
	/*	permet de cibler un attribut ou une méthode de l'objet de la classe en cours.
		this.firstname appellera donc l'attribut firstname de l'objet de la classe Wilder.
	*/
		this.firstname = firstname;
		this.aware = aware;
	}

	// accesseurs (getters)
	public String getFerstname(){
		return this.firstname;
	}

	public boolean isAware(){
		return this.aware;
	}

	//	Methode de ma class Wilder
	public String whoAmI(){
		if (this.isAware()) {
									// utilisation de getters    
			return "Je m'appelle " + this.getFerstname() + " et je suis aware.";
		}else{						// utilisation de getters    
			return "Je m'appelle " + this.getFerstname() + " et e ne suis pas aware.";
		}
	}
}

