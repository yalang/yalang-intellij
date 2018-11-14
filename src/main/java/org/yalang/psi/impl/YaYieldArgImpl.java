// This is a generated file. Not intended for manual editing.
package org.yalang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.yalang.psi.YaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.yalang.psi.*;

public class YaYieldArgImpl extends ASTWrapperPsiElement implements YaYieldArg {

  public YaYieldArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YaVisitor visitor) {
    visitor.visitYieldArg(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YaVisitor) accept((YaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YaTest getTest() {
    return findChildByClass(YaTest.class);
  }

  @Override
  @Nullable
  public YaTestlist getTestlist() {
    return findChildByClass(YaTestlist.class);
  }

}
