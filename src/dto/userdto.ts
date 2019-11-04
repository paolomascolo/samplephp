import { Usertype } from './usertype';

/**
 * Classe DTO di User. DEVE essere uguale (stesso nome classe, stessi attributi e stessi nomi) a
 * quello nel backend. 
 * 
 */
export class UserDTO {

   id: number;

   username: string;

   password: string;

   usertype: Usertype;

}

