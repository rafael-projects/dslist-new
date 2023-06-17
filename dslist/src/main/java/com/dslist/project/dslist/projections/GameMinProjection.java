package com.dslist.project.dslist.projections;

import org.hibernate.id.IntegralDataTypeHolder;

public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
