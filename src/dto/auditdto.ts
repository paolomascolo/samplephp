import { UserDTO } from './userdto';

export class AuditDTO {

    id: number;

    status: string;

    user: UserDTO; 
}