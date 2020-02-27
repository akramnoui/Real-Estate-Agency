public class criterePrix {
    public criterePrix(float prixMinimal, float prixMaximal) {
        PrixMaximal = prixMaximal;
        PrixMinimal = prixMinimal;
    }

    private float PrixMaximal;
    private float PrixMinimal;

    public float getPrixMaximal() {
        return PrixMaximal;
    }

    public void setPrixMaximal(float prixMaximal) {
        PrixMaximal = prixMaximal;
    }

    public float getPrixMinimal() {
        return PrixMinimal;
    }

    public void setPrixMinimal(float prixMinimal) {
        PrixMinimal = prixMinimal;
    }
}
