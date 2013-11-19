/*---------------------------------------------------------------------*/
/*!
 * @brief	Extension Command Arguments class
 * @author	t_sato
 */
/*---------------------------------------------------------------------*/
package BtoC;

import java.lang.*;
import Common.*;


public class ExCmdArg extends CmdArg
{
	public boolean isVersion;
	public boolean isHelp;
	public boolean isExtern;

	/*---------------------------------------------------------------------*/
	//*!brief	constructor
	/*---------------------------------------------------------------------*/
	public ExCmdArg(char optionPrefix)
	{
		Init();
		super(optionPrefix);
	}
	
	public ExCmdArg(char optionPrefix, String[] args)
	{
		Init();
		super(optionPrefix, args);
	}
	
	/*---------------------------------------------------------------------*/
	//*!brief	initialize method
	/*---------------------------------------------------------------------*/
	private void Init()
	{
		this.isVersion = false;
		this.isHelp = false;
		this.isExtern = false;
	}
	
	/*---------------------------------------------------------------------*/
	//*!brief	analyze command arguments
	//*!param	option	option string
	//*!param	args	option argument
	/*---------------------------------------------------------------------*/
	protected void optionAnalyze(String option, String[] args)
	{
		
	}
}
