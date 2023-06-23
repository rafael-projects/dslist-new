package com.dslist.project.dslist.projections;

import org.hibernate.id.IntegralDataTypeHolder;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
