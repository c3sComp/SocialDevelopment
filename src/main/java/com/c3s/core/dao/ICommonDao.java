package com.c3s.core.dao;

/**
 * This interface contains common DAOs for all modules
 * @author C3S
 *
 */
public interface ICommonDao {

	/**
	 * Save a mapped entity
	 * @param model
	 */
	public void saveModel(Object model);

	/**
	 * update a mapped entity
	 * @param model
	 */
	public void updateModel(Object model);

	/**
	 * delete a mapped entity
	 * @param model
	 */
	public void deleteModel(Object model);

}
