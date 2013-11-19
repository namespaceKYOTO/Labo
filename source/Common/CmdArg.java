/*---------------------------------------------------------------------*/
/*!
 * @brief	Command Argument class
 * @author	t_sato
 */
/*---------------------------------------------------------------------*/
package Common;

import java.lang.*;

public class CmdArg
{
	protected char optionPrefix;
	
	/*---------------------------------------------------------------------*/
	//*!brief	constructor
	/*---------------------------------------------------------------------*/
	public CmdArg()
	{
		Init();
	}
	
	public CmdArg(char optionPrefix)
	{
		Init();
		this.optionPrefix = optionPrefix;
	}
	
	public CmdArg(char optionPrefix, String[] args)
	{
		Init();
		analyzeCommandArguments(args);
	}
	
	/*---------------------------------------------------------------------*/
	//*!brief	initialize method
	/*---------------------------------------------------------------------*/
	private void Init()
	{
		this.optionPrefix = 0;
	}
	
	/*---------------------------------------------------------------------*/
	//*!brief	analyze command arguments
	/*---------------------------------------------------------------------*/
	public void analyzeCommandArguments(String[] args)
	{
		int counter = 0;
		//for(String arg : args)
		for( int i = 0; i < args.length; ++i )
		{
			if( args[i].charAt(0) == this.optionPrefix )
			{
				// next arg
				++i;
				
				// get argument for option
				int argCount = 0;
				for( ; i + argCount < args.length; ++argCount )
				{
					if( args[i + argCount].charAt(0) == this.optionPrefix )
					{
						break;
					}
				}
				
				// call option analyzer
				if( argCount > 0 )
				{
					String[] options = new String[argCount];
					System.arraycopy(args, i, options, 0, argCount);
					optionAnalyze(args[i - 1], options);
				}
				else 
				{
					optionAnalyze(args[i - 1], null);
				}
			}
		}
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
