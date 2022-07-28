package entities.concretes;

public class Feature {
    private int featureId;
    private String featureName;

    private double featureValue;

    public Feature() {
    }

    public Feature(int featureId, String featureName) {
        this.featureId = featureId;
        this.featureName = featureName;
    }

    public Feature(int featureId, String featureName, double featureValue) {
        this.featureId = featureId;
        this.featureName = featureName;
        this.featureValue = featureValue;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public double getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(double featureValue) {
        this.featureValue = featureValue;
    }
}
