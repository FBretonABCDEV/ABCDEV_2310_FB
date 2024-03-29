package exercice_geometry;

public class Cercle {
	
	//variables d'instance
	Point centre;
	double rayon;
	
	//constructeurs
	public Cercle(Point _centre, double _rayon) {
		this.centre = _centre;
		this.rayon = _rayon;
	}
	
	//méthode
	public double perimetre() {
		double perimetre = 2* Math.PI * this.rayon;
		return perimetre;
	}
	
	public double surface() {
		double surface = Math.PI * Math.pow(rayon, 2);
		return surface;
	}
	
	public void Appartenance(Point _point) {
		//pythagore
		double distancePoint = Math.sqrt(Math.abs(Math.pow((_point.getAbscisse() - this.centre.getAbscisse()), 2)) + Math.abs(Math.pow((_point.getOrdonnee() - this.centre.getOrdonnee()), 2)));
		if(rayon == distancePoint) {
			System.out.println("Le point appartient au cercle.");
		}else {
			System.out.println("Le point n'appartient pas au cercle.");
		}
	}
	
	public void Afficher() {
		System.out.println("Le périmètre du cercle est : "+this.perimetre()+"\nLa surface du disque est : "+this.surface()+" ²");
	}
}
