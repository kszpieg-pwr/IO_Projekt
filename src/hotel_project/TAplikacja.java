/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_project;

import java.util.List;

/**
 *
 * @author Dell
 */
public class TAplikacja {

	protected List<THotel> Hotele;
	protected List<TUser> Users;
	protected List<TRezerwacja> Rezerwacje;

	public void showlHotel() {
		// TODO - implement TAplikacja.showlHotel
		throw new UnsupportedOperationException();
	}

	public void showPokoj() {
		// TODO - implement TAplikacja.showPokoj
		throw new UnsupportedOperationException();
	}

	public void update_info() {
		// TODO - implement TAplikacja.update_info
		throw new UnsupportedOperationException();
	}

	public void deleteRezerwacje() {
		// TODO - implement TAplikacja.deleteRezerwacje
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param t
	 */
	public static void main(String[] t) {

	}

	/**
	 * 
	 * @param data
	 */
	public TRezerwacja addRezerwacja(String[] data) {
                throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
	public THotel addHotel(String[] data) {
                throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
	public TUser addUser(String[] data) {
		TFabryka fabryka = new TFabryka();
                TUser User = fabryka.Create_user(data);
                if(searchUser(User)==null)
                {
                    Users.add(User);
                }
                return null;
	}

	/**
	 * 
	 * @param User
	 */
	public TUser searchUser(TUser User) {
		// TODO - implement TAplikacja.searchUser
		throw new UnsupportedOperationException();
	}

}
