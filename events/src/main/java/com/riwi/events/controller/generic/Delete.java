package com.riwi.events.controller.generic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

public interface Delete <ID>{
    public ResponseEntity<Void> delete (ID id);
}
