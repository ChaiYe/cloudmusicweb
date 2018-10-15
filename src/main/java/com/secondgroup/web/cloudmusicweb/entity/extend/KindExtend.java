package com.secondgroup.web.cloudmusicweb.entity.extend;

import com.secondgroup.web.cloudmusicweb.entity.BaseKind;
import com.secondgroup.web.cloudmusicweb.entity.Kind;

public class KindExtend extends Kind {

    private BaseKind baseKind;

    public BaseKind getBaseKind() {
        return baseKind;
    }

    public void setBaseKind(BaseKind baseKind) {
        this.baseKind = baseKind;
    }
}
