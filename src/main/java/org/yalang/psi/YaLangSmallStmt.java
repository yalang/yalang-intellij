// This is a generated file. Not intended for manual editing.
package org.yalang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YaLangSmallStmt extends PsiElement {

  @Nullable
  YaLangAssertStmt getAssertStmt();

  @Nullable
  YaLangDelStmt getDelStmt();

  @Nullable
  YaLangExprStmt getExprStmt();

  @Nullable
  YaLangFlowStmt getFlowStmt();

  @Nullable
  YaLangGlobalStmt getGlobalStmt();

  @Nullable
  YaLangImportStmt getImportStmt();

  @Nullable
  YaLangNonlocalStmt getNonlocalStmt();

  @Nullable
  YaLangPassStmt getPassStmt();

}
