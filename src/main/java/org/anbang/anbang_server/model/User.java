package org.anbang.anbang_server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
  String userId;
  String affiliation;
  String adminId;
}
