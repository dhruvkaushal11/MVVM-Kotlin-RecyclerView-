
package com.retrofit1.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.retrofit1.Datum;

public class DataModel {

    @SerializedName("status_code")
    @Expose
    private String statusCode;
    @SerializedName("status_message")
    @Expose
    private String statusMessage;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("cube_widget")
    @Expose
    private CubeWidget cubeWidget;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public CubeWidget getCubeWidget() {
        return cubeWidget;
    }

    public void setCubeWidget(CubeWidget cubeWidget) {
        this.cubeWidget = cubeWidget;
    }

}
