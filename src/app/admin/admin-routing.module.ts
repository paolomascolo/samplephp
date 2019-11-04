import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminLayoutComponent } from '../layout/admin-layout/admin-layout.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { UsersComponent } from './users/users.component';
import { WorkInProgressComponent } from './work-in-progress/work-in-progress.component';
import { ServiziComponent } from './servizi/servizi.component';
import { AuthGuard } from '../../guard/auth/auth.guard';
import { AuditComponent } from './audit/audit.component';
import { EconomyComponent } from './economy/economy.component';
import { CompanyComponent } from './company/company.component';

/**
 * Modulo di routing dell'admin. Qui ci sono i percorsi che un admin può seguire:
 * appena fa il login viene caricato nel <router-outlet> di app-component il layout e nel 
 * <router-outlet> del layout (come percorsi "children") vengono visualizzati gli altri 
 * (qui sotto sono indentati). Si osservi il Guard "canActivate: [AuthGuard]" che protegge le routes
 * del'ADMIN dagli altri utenti.
 * 
 * @author Vittorio Valent
 * 
 * @see AdminLayoutComponent
 * @see AuthGuard
 * @see layout
 */
const routes: Routes = [
  {
    path: 'admin-dashboard', component: AdminLayoutComponent, canActivate: [AuthGuard], children: [
      { path: '', component: AdminDashboardComponent },
      { path: 'users', component: UsersComponent },
      { path: 'work-in-progress', component: WorkInProgressComponent },
      { path: 'servizi', component: ServiziComponent },
      { path: 'audit', component: AuditComponent },
      { path: 'economy', component: EconomyComponent },
      { path: 'company', component: CompanyComponent }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }