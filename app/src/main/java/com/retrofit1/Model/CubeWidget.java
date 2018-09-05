
package com.retrofit1.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CubeWidget {

    @SerializedName("show_widget")
    @Expose
    private String showWidget;
    @SerializedName("widget_detail")
    @Expose
    private List<WidgetDetail> widgetDetail = null;

    public String getShowWidget() {
        return showWidget;
    }

    public void setShowWidget(String showWidget) {
        this.showWidget = showWidget;
    }

    public List<WidgetDetail> getWidgetDetail() {
        return widgetDetail;
    }

    public void setWidgetDetail(List<WidgetDetail> widgetDetail) {
        this.widgetDetail = widgetDetail;
    }

}
