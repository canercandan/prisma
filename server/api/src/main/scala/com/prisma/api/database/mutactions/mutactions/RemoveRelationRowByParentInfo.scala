package com.prisma.api.database.mutactions.mutactions

import com.prisma.api.database.DatabaseMutationBuilder
import com.prisma.api.database.mutactions.{ClientSqlDataChangeMutaction, ClientSqlStatementResult}
import com.prisma.api.mutations.ParentInfo
import com.prisma.shared.models.Project

import scala.concurrent.Future

case class RemoveRelationRowByParentInfo(project: Project, parentInfo: ParentInfo) extends ClientSqlDataChangeMutaction {

  override def execute =
    Future.successful(ClientSqlStatementResult(DatabaseMutationBuilder.deleteRelationRowByParent(project.id, parentInfo)))

}
